package com.mycompany.alocacao_veiculos.controller;

import java.util.List;

import com.mycompany.alocacao_veiculos.model.Cliente;
import com.mycompany.alocacao_veiculos.model.dao.ClienteDAO;

/**
 *
 * @author hitallo
 */
public class ClienteController {

    private ClienteDAO clienteDao;
    
    public ClienteController(ClienteDAO clienteDao){
        this.clienteDao = clienteDao;
    }

    public void createCliente(
            long cpf, 
            String nome, 
            String endereco, 
            String telefone, 
            String email
    ){
        
        try {
            Cliente newCliente = new Cliente(cpf, nome, endereco, telefone, email);
            this.clienteDao.save(newCliente);
        } catch (Error err){
            System.out.println("Erro ao criar cliente: " + err.getMessage());
        }
    }
    
    public Cliente updateCliente(){
        throw new Error("not implemented");
    }
    
    public void deleteCliente(long cpf){
  
        throw new Error("not implemented");
    }
    
    public List<Cliente> findAllCliente(){
        List<Cliente> clientes;
        
        clientes = this.clienteDao.getAll();
        
        return clientes;
    }
    
    public Cliente findClienteByCPF(long cpfCliente){
        throw new Error("not implemented");
    }
    
}
