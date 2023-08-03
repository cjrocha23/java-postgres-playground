package com.example;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AppCidadao {
    String nome;
    String dataNascimento;
    String idade;
    String padraoData = "yyyy-MM-dd";

    // Nome.
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Data Nascimento.
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        //LocalDate dataAtual = LocalDate.now();
        int anoAtual = LocalDate.now().getYear();
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern(padraoData);
        LocalDate dataFornecida = LocalDate.parse(dataNascimento, formatoData);
        //Period idade = Period.between(dataAtual, dataFornecida);
        //LocalDate dataInformada = getDataNascimento();
        //LocalDate dataString = DateTimeFormatter.ofPattern(padraoData);
        System.out.println("Idade..........: " + idade);
        System.out.println("Ano............: " + idade);

    }
    
}
