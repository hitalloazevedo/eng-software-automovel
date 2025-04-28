package com.mycompany.alocacao_veiculos.model;
<<<<<<< HEAD

public class Cliente {
    private long cpf_cli;
    private String nom_cli;
    private String end_cli;
    private String tel_cli;
    private String email_cli;
=======
>>>>>>> b0cda9d7821387826d92e95653d2845027dda02d

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
