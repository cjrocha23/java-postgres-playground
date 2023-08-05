package com.example;

import com.example.Model.Cidadao;

public class AppCidadaoObrigatoriedadeVoto {
        /*
            Obrigatoriedade de Voto:
            - Não eleitor:
                · Menores de 16 anos.
            - Eleitor facultativo:
                · Maiores de 15 anos e menores de 18 anos.
                · Maiores de 70 anos.
            - Eleitor obrgatório:
                · Entre 18 e 70 anos.
            Criar método para indicar o tipo de eleitor.
            Solução:
             - Criar classe "Cidadao" com atriuto "LocalDate dataNascimento".
             - Criar método paa calcular idade.       
        */

    public static void main(String[] args) {
        Cidadao cidadao = new Cidadao();
        cidadao.setNome("Cláudio");
        cidadao.setDataNascimento("1967-11-23");
        System.out.println("Nome...........: " + cidadao.getNome());
        System.out.println("Data Nascimento: " + cidadao.getDataNascimento());
    }
}
