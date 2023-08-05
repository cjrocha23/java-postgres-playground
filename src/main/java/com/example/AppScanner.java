package com.example;

import java.util.Scanner;

import com.example.Model.Cliente;

public class AppScanner {
    public static void main(String[] args) {
        Cliente appCliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dados do Cliente");
        System.out.println("================");
        System.out.println("Nome...........: ");
        appCliente.setNome(scanner.nextLine());
        System.out.println("Cpf............: ");
        appCliente.setCpf(scanner.nextLine());
        System.out.println("Sexo...........: ");
        appCliente.setSexo(scanner.nextLine().charAt(0));
        System.out.println("Ano Nascimento.: ");
        appCliente.setRenda(scanner.nextDouble());
        System.out.println("Renda..........: ");
        appCliente.setAnoNascimento(scanner.nextInt());

        System.out.println("--- Resultado ---");
        System.out.println(appCliente.getNome());
        System.out.println(appCliente.getCpf());
        System.out.println(appCliente.getSexo());
        System.out.println(appCliente.getAnoNascimento());
        System.out.println(appCliente.getRenda());
        System.out.println(appCliente.isEspecial());

        System.out.println();
    }
}
