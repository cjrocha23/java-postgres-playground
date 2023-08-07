package com.example;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.Model.Marca;
import com.example.Model.Produto;
import com.example.dao.ConnectionManager;

public class AppbancoDadosV5 {
    public static void main(String[] args) {
        // Verão refatorada.
        System.out.println();
        System.out.println("### Banco de Dados JAVA - Final. ###");
        System.out.println();
        new AppBancoDadosV4();
        System.out.println();        
    }

    public AppbancoDadosV5() {
        try (var conexao = ConnectionManager.getConnection()) {
            //carregarDriverJdbc();
            //listarEstados(conexao);
            //localizarEstado(conexao, "MG");
            //listarDadosTabela(conexao, "produto");
            
            var marca = new Marca();
            marca.setId(1L);
            var produto = new Produto();
            produto.setMarca(marca);
            produto.setNome("Produto 4");
            produto.setValor(400.00);
            //inserirProduto(conexao, produto);
            
            excluirProduto(conexao, 203);

            //listarDadosTabela(conexao, "produto");
            
        } catch (SQLException e) {
            System.err.println("Não foi possível conectar com o Banco de Dados: \n" + e.getMessage());
        }
    }

    private void excluirProduto(Connection conexao, int id) {
        var sql = "DELETE FROM produto WHERE id = ?";
        try {
            var statement = conexao.prepareStatement(sql);
            statement.setLong(1, id);
            if (statement.executeUpdate() == 1) {
                listarDadosTabela(conexao, "produto");
                System.out.println("Produto excluído com sucesso no BD.");
            } else {
                System.out.println("Produto não foi licalizado no BD.");
            }
        } catch (SQLException e) {
            System.err.println("Não foi possível excluir o produto no Banco de Dados: \n" + e.getMessage());
        }
    }

    private void inserirProduto(Connection conexao, Produto produto) {
        var sql = "INSERT INTO produto (nome, marca_id, valor) values (?, ?, ?)";
        try (var statement = conexao.prepareStatement(sql)) {
            statement.setString(1, produto.getNome());
            statement.setLong(2, produto.getMarca().getId());
            statement.setDouble(3, produto.getValor());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro na inclusão do produto " + produto.getNome() + " no Banco de Dados: \n" + e.getMessage());
        }
    }

    private void listarDadosTabela(Connection conexao, String tabela) {
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

    /* Movido para DAO.
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(ConnectionManager.JDBC_URL, ConnectionManager.JDBC_USR, ConnectionManager.JDBC_PWD);
    }
    */

    /* Declaração do JDBC desnecessário.
    private void carregarDriverJdbc() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a bibliotgeca para acesso ao banco de dados: " + e.getMessage());
        }
    }
    */
    
}
