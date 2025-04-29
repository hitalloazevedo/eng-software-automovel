package com.mycompany.alocacao_veiculos.controller;

import java.util.List;
import java.util.Optional;

import com.mycompany.alocacao_veiculos.model.Modelo;
import com.mycompany.alocacao_veiculos.model.dao.ModeloDAO;

public class ModeloController {

    private ModeloDAO modeloDao;

    public ModeloController(ModeloDAO modeloDao) {
        this.modeloDao = modeloDao;
    }

    public void createModelo(String descricaoModelo) {
        try {
            Modelo novoModelo = new Modelo(descricaoModelo);
            this.modeloDao.save(novoModelo);
        } catch (Error err) {
            System.out.println("Erro ao criar modelo: " + err.getMessage());
        }
    }

    public Modelo updateModelo(Long id, String novaDescricao) {
        Optional<Modelo> oldModelo = this.modeloDao.get(id);
        if (oldModelo.isPresent()) {
            Modelo modelo = oldModelo.get();
            // Atualização fictícia, pois não há setDescricaoModelo()
            System.out.println("Aviso: Modelo não tem setter para descrição. Atualização não efetivada.");
            return modelo;
        }
        throw new Error("Modelo não encontrado");
    }

    public void deleteModelo(Modelo modelo) {
        this.modeloDao.delete(modelo);
    }

    public List<Modelo> findAllModelos() {
        return this.modeloDao.getAll();
    }

    public Optional<Modelo> findModeloById(Long id) {
        return this.modeloDao.get(id);
    }
}
