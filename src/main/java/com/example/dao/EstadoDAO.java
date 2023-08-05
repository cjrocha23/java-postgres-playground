package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class EstadoDAO {
    private Connection conexao;

    public EstadoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void listar() {
        try {
            var statement = conexao.createStatement();
            var resultado = statement.executeQuery("SELECT * FROM estado");

            while (resultado.next()) {
                System.out.printf("Id: %d - Nome: %s - UF: %s \n", resultado.getInt("id"), resultado.getString("nome"), resultado.getString("uf"));
            }

        } catch (SQLException e) {
                System.err.println("Não foi possível executar a consulta com o Banco de Dados: \n" + e.getMessage());
        }
    }

    public void localizar(Connection conexao, String uf) {
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
    
}
