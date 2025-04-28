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

    private final ClienteDAO clienteDao;
    
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
        if (oldCliente.isEmpty()){
            throw new Error("usuário não encontrado.");
        }
        Cliente novoCliente = new Cliente(cpf, oldCliente.get().getNome(), endereco, telefone, endereco);
        return novoCliente;
    }
    
    public void deleteCliente(Long cpf){
        
        this.clienteDao.delete(cpf);
  
    }
    
    public List<Cliente> findAllCliente(){
        List<Cliente> clientes;
        
        clientes = this.clienteDao.getAll();
        
        return clientes;
    }
    
    public Optional<Cliente> findClienteByCPF(long cpf){
        Optional<Cliente> cliente = this.clienteDao.get(cpf);
        return cliente;
    }
    
}
