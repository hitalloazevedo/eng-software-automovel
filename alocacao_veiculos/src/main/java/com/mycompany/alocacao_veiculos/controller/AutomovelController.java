package com.mycompany.alocacao_veiculos.controller;

import com.mycompany.alocacao_veiculos.model.Automovel;
import com.mycompany.alocacao_veiculos.model.Automovel.TipoCombustivel;
import com.mycompany.alocacao_veiculos.model.dao.AutomovelDAO;

import java.util.List;
import java.util.Optional;

/**
 * Controller para gerenciar operações relacionadas a Automóveis.
 */
public class AutomovelController {
    private AutomovelDAO automovelDAO;

    public AutomovelController() {
        this.automovelDAO = new AutomovelDAO();
    }

    // CREATE
    public void createAutomovel(String placa, String cor, int nroPortas, int tipoCombustivel,
                                long quilometragem, long renavam, String chassi, double valorLocacao) {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia.");
        }
        Automovel automovel = new Automovel(placa, cor, nroPortas, tipoCombustivel, quilometragem, renavam, chassi, valorLocacao);
        try {
            automovelDAO.save(automovel);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar o automóvel: " + e.getMessage(), e);
        }
    }

    // READ
    public List<Automovel> listAutomoveis() {
        try {
            return automovelDAO.findAll();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar automóveis: " + e.getMessage(), e);
        }
    }

    public Optional<Automovel> findAutomovelByPlaca(String placa) {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia.");
        }
        try {
            return Optional.ofNullable(automovelDAO.findByPlaca(placa));
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar o automóvel pela placa: " + e.getMessage(), e);
        }
    }

    // UPDATE
    public void updateAutomovel(String placa, String cor, int nroPortas, TipoCombustivel tipoCombustivel,
                                long quilometragem, long renavam, String chassi, double valorLocacao) {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia.");
        }
        Automovel automovel = new Automovel(placa, cor, nroPortas, tipoCombustivel, quilometragem, renavam, chassi, valorLocacao);
        try {
            automovelDAO.update(automovel);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar o automóvel: " + e.getMessage(), e);
        }
    }

    // DELETE
    public void deleteAutomovel(String placa) {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia.");
        }
        try {
            automovelDAO.deleteByPlaca(placa);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao deletar o automóvel: " + e.getMessage(), e);
        }
    }
}