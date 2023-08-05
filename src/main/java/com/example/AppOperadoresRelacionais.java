package com.example;

import com.example.Model.Cliente;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("### Operadores Relacionais JAVA. ###");
        System.out.println();
        
        var cliente1 = new Cliente();
        cliente1.setAnoNascimento(1980);

        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(2010);

        // Exemplo 1
        if (cliente1.getAnoNascimento() == cliente2.getAnoNascimento()) {
            System.out.println("Clientes com data de nascimento iguais.");
        }
        else {
            System.out.println("Clientes com data de nascimento diferentes.");
        }
        
        // Exemplo 2
        boolean cliente1MaisJovem = cliente1.getAnoNascimento() > cliente2.getAnoNascimento();
        boolean cliente1MaisVelho = cliente1.getAnoNascimento() < cliente2.getAnoNascimento();

        if (cliente1MaisJovem) {
            System.out.println("Cliente 1 é mais jovem.");
        }
        else if (cliente1MaisVelho) {
            System.out.println("Cliente 2 é mais jovem.");
        }
        else {
            System.out.println("Clientes 1 e 2 possuem a mesma idade.");
        }
        System.out.println();        

    }
}
