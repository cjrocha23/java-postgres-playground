package com.example;

    class Metodo {
        public String nome;
        public String endereco;

        public Metodo(String nome, String endereco) {
            if (nome.isBlank())
                // toUpperCase() - Converte para caixa alta.
                this.nome = nome.toUpperCase();
            
                // trim() - Remove espaços na string.
                this.endereco = endereco.toUpperCase().trim();
                //System.out.println("Erro.");
        }

        public Metodo(String nome) {
            this.nome = nome;
        }

    }

public class AppMetodos {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("### Métodos JAVA. ###");
        System.out.println();
        
        Metodo metodo = new Metodo("Cláudio José Rocha", "   Rua das Americas, 120.     ");
        
        System.out.println("Conversão para UpperCase:");
        System.out.println(metodo.nome);

        System.out.println("Elimina espaços no início e final da string:");
        System.out.println(metodo.endereco);
        
        System.out.println("Splita uma String com definição específica:");
        Metodo metodo2 = new Metodo("Cláudio Rocha");
        var vetorNome = metodo2.nome.split(" ");
        System.out.println(vetorNome[0]);
        System.out.println(vetorNome[1]);

        System.out.println("Extrair determinado caractér de uma string:");
        System.out.println(vetorNome[0].charAt(0));

        System.out.println();
    }
}
