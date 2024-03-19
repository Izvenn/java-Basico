package com.example;

public class ContaTerminal {
    
private String agencia;
private String conta;
private String nome;
private double saldo;

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public double getSaldo() {
    return saldo;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public String getAgencia() {
    return agencia;
}

public String getConta() {
    return conta;
}

public ContaTerminal(String agencia, String conta) {
    this.agencia = agencia;
    this.conta = conta;
}



}
