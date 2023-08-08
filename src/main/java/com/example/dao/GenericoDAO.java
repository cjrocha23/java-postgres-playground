package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class GenericoDAO {
    protected Connection conexao;

    public GenericoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public void listar(String tabela) {
        var sql = "SELECT * FROM " + tabela;
        System.out.println("Resultado da Consulta SQL: '" + sql + "'");

        try {
            var statement  = conexao.createStatement();
            var resultado = statement.executeQuery(sql);

            var metadata = resultado.getMetaData();
            int colunas = metadata.getColumnCount();

            for (int i = 1; i <= colunas; i++) {
                System.out.printf("%-25s | ", metadata.getColumnName(i));
            }
            System.out.println();

            while (resultado.next()) {
                //int colunas = resultado.getMetaData().getColumnCount();
                for (int i = 1; i <= colunas; i++) {
                    System.out.printf("%-25s | ", resultado.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            System.err.println("Erro na execução da consulta." + e.getMessage());
        }
    }

}
