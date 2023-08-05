package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.example.Model.Cliente;

public class AppListas {
    // Listas possuem capacidade serem aumentadas à medida que inserções são realizadas.
    public static void main(String[] args) {

        System.out.println();
        System.out.println("### Listas JAVA. ###");
        System.out.println();

        // Exemplo de declaração de vetor.
        // AppCliente vetorCliente = new AppCliente[5];
        // Exemplo de declaração e uso da Lista.
        // List<AppCliente> listaClientes = new ArrayList<>();
        // Caso seja uma lista com número de linhas pré definidas,
        // essas podem ser declaradas no momento declaração do construtor.
        // Ex. para 10 elementos:
        // List<AppCliente> listaClientes = new ArrayList<>(10);
        // Caso não seja sabido o númeto de elementos, pode-se usar o LinkedList:
        List<Cliente> listaClientes = new LinkedList<>();
        // O LinkedList vai reservando memória à medida que os elementos sejam inseridos.

        var cliente1 = new Cliente();
        cliente1.setNome("Cláudio");

        var cliente2 = new Cliente();
        cliente2.setNome("Rocha");
        
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }

        // Remoção na lista. Pode ser referenciado o index ou pelo construtor.
        // Pelo índice, removendo o primeiro elemento.
        //listaClientes.remove(0);
        // Pelo índice, removendo o último elemento.
        //int i = listaClientes.size() - 1;
        //listaClientes.remove(i);

        System.out.println();   

    }
}
