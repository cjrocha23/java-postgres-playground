package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppBancoDadosV3Final {
    private static final String JDBC_PWD = "";
    private static final String JDBC_USR = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static void main(String[] args) {
        // Verão com melhorias nos tratamentos de erro.
        System.out.println();
        System.out.println("### Banco de Dados JAVA - Final. ###");
        System.out.println();
        listarEstados();
        System.out.println();
    }

    private static void listarEstados() {
        carregarDriverJdbc();

        Statement statement = null;
        try (var conexao = getConnection()) {
            System.out.println("Conexão com o Banco de Dados realizada com sucesso.");

            statement = conexao.createStatement();
            var resultado = statement.executeQuery("SELECT * FROM estado");

            while (resultado.next()) {
                System.out.printf("Id: %d - Nome: %s - UF: %s \n", resultado.getInt("id"), resultado.getString("nome"), resultado.getString("uf"));
            }

        } catch (SQLException e) {
            if (statement == null) {
                System.err.println("Não foi possível conectar com o Banco de Dados: \n" + e.getMessage());
            } else {
                System.err.println("Não foi possível executar a consulta com o Banco de Dados: \n" + e.getMessage());
            }
        }
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USR, JDBC_PWD);
    }

    private static void carregarDriverJdbc() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a bibliotgeca para acesso ao banco de dados: " + e.getMessage());
        }
    }
}
