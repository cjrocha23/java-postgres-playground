package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBancoDadosV3 {
    private static final String JDBC_PWD = "";
    private static final String JDBC_USR = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";
    private Connection conexao;

    public static void main(String[] args) {
        // Verão refatorada.
        System.out.println();
        System.out.println("### Banco de Dados JAVA - Final. ###");
        System.out.println();
        new AppBancoDadosV3();
        System.out.println();
    }

    public AppBancoDadosV3() {
        try (var conexao = getConnection()) {
            //carregarDriverJdbc();
            //listarEstados(conexao);
            localizarEstado(conexao, "MG");
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar com o Banco de Dados: \n" + e.getMessage());
        }

    }

    private void localizarEstado(Connection conexao, String uf) {
        try {
            // Suncetível ao ataque de SQL Injection.
            // var resultado = statement.executeQuery("SELECT * FROM estado WHERE uf = '"+ uf +"'");
            var sql = "SELECT * FROM estado WHERE uf = ?";
            var statement = conexao.prepareStatement(sql);
            System.out.println("Resultado da Consulta SQL: '" + sql + "'");
            statement.setString(1, uf);
            var resultado = statement.executeQuery();

            while (resultado.next()) {
                System.out.printf("Id: %d - Nome: %s - UF: %s \n", resultado.getInt("id"), resultado.getString("nome"), resultado.getString("uf"));
            }            

        } catch (Exception e) {
            System.err.println("Erro ao executar a consulta SQL: \n" + e.getMessage());
        }
    }

    private void listarEstados(Connection conexao) {
        try {
            System.out.println("Conexão com o Banco de Dados realizada com sucesso.");

            var statement = conexao.createStatement();
            var resultado = statement.executeQuery("SELECT * FROM estado");

            while (resultado.next()) {
                System.out.printf("Id: %d - Nome: %s - UF: %s \n", resultado.getInt("id"), resultado.getString("nome"), resultado.getString("uf"));
            }

        } catch (SQLException e) {
                System.err.println("Não foi possível executar a consulta com o Banco de Dados: \n" + e.getMessage());
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USR, JDBC_PWD);
    }

    private void carregarDriverJdbc() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a bibliotgeca para acesso ao banco de dados: " + e.getMessage());
        }
    }
}
