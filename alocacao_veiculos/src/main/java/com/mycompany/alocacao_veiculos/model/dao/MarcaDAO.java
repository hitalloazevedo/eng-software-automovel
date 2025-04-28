package com.mycompany.alocacao_veiculos.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MarcaDao implements Dao<Marca> {
    private List<Marca> marcas = new ArrayList<>();

    @Override
    public Optional<Marca> get(long id) {
        if (id >= 0 && id < marcas.size()) {
            return Optional.of(marcas.get((int) id));
        }
        return Optional.empty();
    }

    @Override
    public List<Marca> getAll() {
        return new ArrayList<>(marcas);
    }

    @Override
    public void save(Marca marca) {
        marcas.add(marca);
    }

    @Override
    public void update(Marca marca, String[] params) {
        System.out.println("Atualização de Marca não implementada (falta setter).");
    }

    @Override
    public void delete(Marca marca) {
        marcas.remove(marca);
    }
}
