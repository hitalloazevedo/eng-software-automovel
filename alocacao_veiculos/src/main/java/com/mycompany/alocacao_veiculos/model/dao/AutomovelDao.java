package com.mycompany.alocacao_veiculos.model.dao;

import com.mycompany.alocacao_veiculos.model.Automovel;
import com.mycompany.alocacao_veiculos.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AutomovelDao implements Dao<Automovel, Long> {
    private List<Automovel> automoveis = new ArrayList<>();

    @Override
    public Optional<Automovel> get(Long id) {
        return automoveis.stream()
            .filter(automovel -> automovel.getModelo() != null && automovel.getModelo().hashCode() == id)
            .findFirst();
    }

    @Override
    public List<Automovel> getAll() {
        return new ArrayList<>(automoveis);
    }

    @Override
    public void save(Automovel automovel) {
        automoveis.add(automovel);
    }

    @Override
    public void update(Automovel automovel, String[] params) {
        if (params.length >= 2) {
            automovel.setquilometragemAutomovel(Long.parseLong(params[0]));
            automovel.setvalorLocacaoAutomovel(Double.parseDouble(params[1]));
        }
    }

    @Override
    public void delete(Long id) {
        List<Automoveis> collect = this.automoveis.stream().filter(cliente -> cliente.get() != id).collect(Collectors.toList());
        this.clientes = collect;
    }
}
