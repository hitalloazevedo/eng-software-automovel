package com.mycompany.alocacao_veiculos.controller;

import java.util.List;
import java.util.Optional;

import com.mycompany.alocacao_veiculos.model.Marca;
import com.mycompany.alocacao_veiculos.model.dao.MarcaDAO;

public class MarcaController {

    private MarcaDAO marcaDao;

    public MarcaController(MarcaDAO marcaDao) {
        this.marcaDao = marcaDao;
    }

    public void createMarca(String descricaoMarca) {
        try {
            Marca novaMarca = new Marca(descricaoMarca);
            this.marcaDao.save(novaMarca);
        } catch (Error err) {
            System.out.println("Erro ao criar marca: " + err.getMessage());
        }
    }

    public Marca updateMarca(Long id, String novaDescricao) {
        Optional<Marca> oldMarca = this.marcaDao.get(id);
        if (oldMarca.isPresent()) {
            Marca marca = oldMarca.get();
            // Atualização fictícia, já que não tem setDescricaoMarca()
            System.out.println("Aviso: Marca não tem setter para descrição. Atualização não efetivada.");
            return marca;
        }
        throw new Error("Marca não encontrada");
    }

    public void deleteMarca(Marca marca) {
        this.marcaDao.delete(marca);
    }

    public List<Marca> findAllMarcas() {
        return this.marcaDao.getAll();
    }

    public Optional<Marca> findMarcaById(Long id) {
        return this.marcaDao.get(id);
    }
}
