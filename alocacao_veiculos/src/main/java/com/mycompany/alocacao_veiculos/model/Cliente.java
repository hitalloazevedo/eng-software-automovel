package com.mycompany.alocacao_veiculos.model;

public class Cliente {
    private long cpfCliente;
    private String nomeCliente;
    private String enderecoCliente;
    private String telefoneCliente;
    private String emailCliente;

    public Cliente(long cpfCliente, String nomeCliente, String enderecoCliente, String telefoneCliente, String emailCliente) {
        this.cpfCliente = cpfCliente;
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.telefoneCliente = telefoneCliente;
        this.emailCliente = emailCliente;
    }

    public String consultarCliente(){
        return this.toString();
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "cpfCliente=" + cpfCliente + ", nomeCliente=" + nomeCliente + ", enderecoCliente=" + enderecoCliente + ", telefoneCliente=" + telefoneCliente + ", emailCliente=" + emailCliente + '}';
    }    
}
