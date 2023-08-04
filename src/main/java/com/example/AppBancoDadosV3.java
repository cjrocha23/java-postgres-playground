package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppBancoDadosV3 {
    public static void main(String[] args) {
        // Verão com melhorias nos tratamentos de erro.
        System.out.println();
        System.out.println("### Banco de Dados JAVA. ###");
        System.out.println();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a bibliotgeca para acesso ao banco de dados: " + e.getMessage());
        }

        Statement statement = null;
        //String stringRes = "Id: %d Nome: %s UF: %s\n", resultado.getI;

        try (var conexao = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "")) {
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
}
