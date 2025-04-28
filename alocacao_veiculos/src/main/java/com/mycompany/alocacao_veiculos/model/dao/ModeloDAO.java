package com.mycompany.alocacao_veiculos.model.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ModeloDao implements Dao<Modelo> {
    private List<Modelo> modelos = new ArrayList<>();

    @Override
    public Optional<Modelo> get(long id) {
        if (id >= 0 && id < modelos.size()) {
            return Optional.of(modelos.get((int) id));
        }
        return Optional.empty();
    }

    @Override
    public List<Modelo> getAll() {
        return new ArrayList<>(modelos);
    }

    @Override
    public void save(Modelo modelo) {
        modelos.add(modelo);
    }

    @Override
    public void update(Modelo modelo, String[] params) {
        System.out.println("Atualização de Modelo não implementada (falta setter para descricaoModelo).");
    }

    @Override
    public void delete(Modelo modelo) {
        modelos.remove(modelo);
    }
}
