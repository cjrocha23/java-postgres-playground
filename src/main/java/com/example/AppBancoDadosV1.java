package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class AppBancoDadosV1 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("### Banco de Dados JAVA. ###");
        System.out.println();
        
        try {
            Class.forName("org.postgresql.Driver");
            try {
                var connection = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "");
                System.out.println("Conexão com o Banco de Dados realizada com sucesso.");

                var statement = connection.createStatement();
                var resultado = statement.executeQuery("SELECT * FROM estado");
                
                while (resultado.next()) {
                    System.out.printf("ID: %d Nome: %s UF: %s\n", resultado.getInt("id"), resultado.getString("nome"), resultado.getString("uf"));
                }

            } catch (SQLException e) {
                // TODO Auto-generated catch block
                //e.printStackTrace();
                System.err.println("Não foi possível carregar a biblioteca para acesso ao bando de dados " + e.getMessage());
            }      } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            //e.printStackTrace();
            System.err.println("Não foi carregar a biblioteca para acesso ao banco de dados.");
        }
    }
}
