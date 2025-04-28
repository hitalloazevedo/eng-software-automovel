package com.mycompany.alocacao_veiculos.model.dao;

import com.mycompany.alocacao_veiculos.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClienteDAO implements Dao<Cliente, Long> {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public Optional<Cliente> get(Long id) {
        return clientes.stream()
            .filter(cliente -> cliente.toString().contains(String.valueOf(id)))
            .findFirst();
    }

    @Override
    public List<Cliente> getAll() {
        return new ArrayList<>(clientes);
    }

    @Override
    public void save(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void update(Cliente cliente, String[] params) {
        // Como não existem setters nos seus modelos, o update precisaria ser ajustado.
        // Exemplo de alteração manual:
        System.out.println("Atualização de Cliente ainda não implementada devido à falta de setters.");
    }

    @Override
    public void delete(Long id) {
        List<Cliente> collect = clientes.stream().filter(cliente -> cliente.getCpf() != id).collect(Collectors.toList());
        this.clientes = collect;
    }
}
