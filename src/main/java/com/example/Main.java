package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String conta;
        String agencia;
        System.out.println("Digite as informações solicitadas!");
        System.out.println("Agencia:");
        agencia = scan.nextLine();
        System.out.println("Conta:");
        conta = scan.nextLine();
        if (agencia.equals("0028") && conta.equals("0021-21")) {
            ContaTerminal infoBank = new ContaTerminal(agencia, conta);
            infoBank.setNome("Vinicius Souza");
            infoBank.setSaldo(1000.00);

            System.out.printf("Olá, %s, obrigado por criar uma conta no nosso banco, sua conta é %s e agencia é %s, seu saldo atual é de %.2f, e já está disponível para saque!", infoBank.getNome(), infoBank.getConta(), infoBank.getAgencia(), infoBank.getSaldo());
        }else{
            System.out.println("Conta inválida!");
        }
        
       scan.close();
    }
}