package com.mycompany.alocacao_veiculos.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AutomovelDao implements Dao<Automovel> {
    private List<Automovel> automoveis = new ArrayList<>();

    @Override
    public Optional<Automovel> get(long id) {
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
    public void delete(Automovel automovel) {
        automoveis.remove(automovel);
    }
}
