package com.example;

public class AppClasses {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("### Classes JAVA. ###");
        System.out.println();

        System.out.println("Cliente 1");
        AppCliente cliente1 = new AppCliente();
        cliente1.setNome("Cláudio");
        cliente1.setRenda(2000);
        cliente1.setSexo('M');
        cliente1.setAnoNascimento(1967);
        
        System.out.println("Nome.........: " + cliente1.getNome());
        System.out.println("Renda........: " + cliente1.getRenda());
        System.out.println("Sexo.........: " + cliente1.getSexo());
        System.out.println("AnoNascimento: " + cliente1.getAnoNascimento());
        System.out.println("Especial.....: " + cliente1.isEspecial());

        System.out.println();
        System.out.println("Cliente 2");
        AppCliente cliente2 = new AppCliente("Mariah", 3000, 'F', 1970);
        //cliente2.setNome("Mariah");
        //cliente2.setRenda(3000);
        //cliente2.setSexo('F');
        //cliente2.setAnoNascimento(1970);
        
        System.out.println("Nome.........: " + cliente2.getNome());
        System.out.println("Renda........: " + cliente2.getRenda());
        System.out.println("Sexo.........: " + cliente2.getSexo());
        System.out.println("AnoNascimento: " + cliente2.getAnoNascimento());
        System.out.println("Especial.....: " + cliente2.isEspecial());

        System.out.println();

        

        System.out.println();

    }
}
