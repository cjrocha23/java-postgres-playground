package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.Model.Produto;

public class ProdutoDAO extends GenericoDAO {

    public ProdutoDAO(Connection conexao) {
        //this.conexao = conexao;
        super(conexao);
    }

    public void excluir(int id) {
        var sql = "DELETE FROM produto WHERE id = ?";
        try {
            var statement = conexao.prepareStatement(sql);
            var genericoDAO = new GenericoDAO(conexao);
            statement.setLong(1, id);
            if (statement.executeUpdate() == 1) {
                genericoDAO.listar("produto");
                System.out.println("Produto excluído com sucesso no BD.");
            } else {
                System.out.println("Produto não foi licalizado no BD.");
            }
        } catch (SQLException e) {
            System.err.println("Não foi possível excluir o produto no Banco de Dados: \n" + e.getMessage());
        }
    }

    public void inserir(Produto produto) {
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


}
