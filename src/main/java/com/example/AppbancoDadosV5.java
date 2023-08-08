package com.example;
import java.sql.SQLException;

import com.example.Model.Marca;
import com.example.Model.Produto;
import com.example.dao.ConnectionManager;
import com.example.dao.EstadoDAO;
import com.example.dao.GenericoDAO;
import com.example.dao.ProdutoDAO;

public class AppbancoDadosV5 {
    public static void main(String[] args) {
        // Verão refatorada.
        System.out.println();
        System.out.println("### Banco de Dados JAVA - V5. ###");
        System.out.println();
        new AppbancoDadosV5();
        System.out.println();        
    }

    public AppbancoDadosV5() {
        try (var conexao = ConnectionManager.getConnection()) {
            // Construtores.
            var estadoDAO = new EstadoDAO(conexao);
            var produtoDAO = new ProdutoDAO(conexao);
            var genericoDAO = new GenericoDAO(conexao);
            
            var marca = new Marca();
            marca.setId(1L);
            var produto = new Produto();
            produto.setMarca(marca);
            produto.setNome("Produto 4");
            produto.setValor(400.00);
            //inserirProduto(conexao, produto);

            //estadoDAO.localizar("MG");
            //produtoDAO.excluir(203);
            genericoDAO.listar("produto");
            
            var listaEstados = estadoDAO.listar();
            for (var estado : listaEstados) {
                System.out.println(estado);
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível conectar com o Banco de Dados: \n" + e.getMessage());
        }
    }
    
}
