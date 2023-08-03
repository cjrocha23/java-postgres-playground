package com.voto;

import java.time.LocalDate;

public class AppCidadao {
    private LocalDate dataNascimento;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    // Calcula a idade: "ano data atual" - "ano data nascimento".
    public int idade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    public String eleitor() {
        int idade = idade();
        if (idade < 16) {
            return "Cidadão com " + idade + " anos de idade, não é eleitor.";
        }
        if (idade >= 16 && idade <= 18 || idade >= 70) {
            return "Cidadão com " + idade + " anos de idade, é eleitor facultativo.";
        }
        return "Cidadão com " + idade + " anos de idade, é eleitor obrigatório.";
    }

}
