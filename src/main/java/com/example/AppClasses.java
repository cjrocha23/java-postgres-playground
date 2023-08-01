package com.example;

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("### Classes JAVA. ###");
        System.out.println("");

        System.out.println("Cliente 1");
        AppCliente cliente1 = new AppCliente();
        cliente1.setNome("Cláudio");
        cliente1.setRenda(2000);
        cliente1.setSexo('e');
        cliente1.setAnoNascimento(1967);
        System.out.println("Nome.........: " + cliente1.nome);
        System.out.println("Renda........: " + cliente1.renda);
        System.out.println("Sexo.........: " + cliente1.sexo);
        System.out.println("AnoNascimento: " + cliente1.anoNascimento);

        System.out.println("");
        System.out.println("Cliente 2");
        AppCliente cliente2 = new AppCliente();
        cliente2.setNome("Mariah");
        cliente2.setRenda(3000);
        cliente2.setSexo('F');
        cliente2.setAnoNascimento(1970);
        System.out.println("Nome.........: " + cliente2.nome);
        System.out.println("Renda........: " + cliente2.renda);
        System.out.println("Sexo.........: " + cliente2.sexo);
        System.out.println("AnoNascimento: " + cliente2.anoNascimento);

        System.out.println("");

    }
}
