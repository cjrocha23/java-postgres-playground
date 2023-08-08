package com.example.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.example.Model.Estado;

public class EstadoDAO extends GenericoDAO {

    public EstadoDAO(Connection conexao) {
        //this.conexao = conexao;
        super(conexao);
    }

    public List<Estado> listar() throws SQLException {
        var lista = new LinkedList<Estado>();
        var statement = conexao.createStatement();
        var resultado = statement.executeQuery("SELECT * FROM estado");
        while (resultado.next()) {
            var estado = new Estado();
            estado.setId(resultado.getInt("id"));
            estado.setNome(resultado.getString("nome"));
            estado.setUf(resultado.getString("uf"));
        }

        return lista;
    }

    public void localizar(String uf) {
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
