package com.mycompany.alocacao_veiculos.controller;

import java.util.List;

import com.mycompany.alocacao_veiculos.model.Cliente;
import com.mycompany.alocacao_veiculos.model.dao.ClienteDAO;
import java.util.Optional;

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
    
    public Cliente updateCliente(long cpf, String email, String telefone, String endereco){
        Optional<Cliente> oldCliente = this.clienteDao.get(cpf);
        if (oldCliente.isPresent()){
            
        }
        throw new Error("not implemented");
    }
    
    public void deleteCliente(Cliente cliente){
        
        this.clienteDao.delete(cliente);
  
    }
    
    public List<Cliente> findAllCliente(){
        List<Cliente> clientes;
        
        clientes = this.clienteDao.getAll();
        
        return clientes;
    }
    
    public Cliente findClienteByCPF(long cpf){
        Optional<Cliente> cliente = this.clienteDao.get(cpf);
        if (cliente.isPresent()){
            return cliente;
        }
    }
    
}
