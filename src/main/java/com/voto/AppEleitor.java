package com.voto;

import java.time.LocalDate;

/*
        ### Requisitos ###
        
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


public class AppEleitor {
    public static void main(String[] args) {
        System.out.println("### Cadastro Cidadão ##");
        AppCidadao cidadao = new AppCidadao();
        cidadao.setDataNascimento(LocalDate.of(2005,11, 23));
        System.out.println(cidadao.eleitor());
    }
}
