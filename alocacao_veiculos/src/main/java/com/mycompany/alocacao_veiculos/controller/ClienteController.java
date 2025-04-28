package com.mycompany.alocacao_veiculos.controller;

import com.mycompany.alocacao_veiculos.model.Cliente;

/**
 *
 * @author hitallo
 */
public class ClienteController {
    public Cliente createCliente(
            long cpfCliente, 
            String nomeCliente, 
            String enderecoCliente, 
            String telefoneCliente, 
            String emailCliente
    ){
        throw new Error("not implemented");
    }
    
    public Cliente updateCliente(){
        throw new Error("not implemented");
    }
    
    public void deleteCliente(long cpfCliente){
        throw new Error("not implemented");
    }
    
    public List<Cliente> findAllCliente(){
        throw new Error("not implemented");
    }
    
    public Cliente findClienteByCPF(long cpfCliente){
        throw new Error("not implemented");
    }
    
}
