package com.mycompany.alocacao_veiculos.controller;

import java.util.List;
import java.util.Optional;

import com.mycompany.alocacao_veiculos.model.Locacao;
import com.mycompany.alocacao_veiculos.model.dao.LocacaoDAO;

public class LocacaoController {

    private LocacaoDAO locacaoDao;

    public LocacaoController(LocacaoDAO locacaoDao) {
        this.locacaoDao = locacaoDao;
    }

    public void createLocacao(
        java.sql.Date dataLocacao,
        java.sql.Time horaLocacao,
        long quilometragemLocacao,
        double valorCaucao
    ) {
        try {
            Locacao newLocacao = new Locacao(dataLocacao, horaLocacao, quilometragemLocacao, valorCaucao);
            this.locacaoDao.save(newLocacao);
        } catch (Error err) {
            System.out.println("Erro ao criar locação: " + err.getMessage());
        }
    }

    public Locacao updateLocacao(Long id, double novoValorLocacao, boolean locacaoDevolvida) {
        Optional<Locacao> oldLocacao = this.locacaoDao.get(id);
        if (oldLocacao.isPresent()) {
            Locacao locacao = oldLocacao.get();
            locacao.setvalorLocacao(novoValorLocacao);
            locacao.setlocacaoDevolvida(locacaoDevolvida);
            return locacao;
        }
        throw new Error("Locação não encontrada");
    }

    public void deleteLocacao(Locacao locacao) {
        this.locacaoDao.delete(locacao);
    }

    public List<Locacao> findAllLocacoes() {
        return this.locacaoDao.getAll();
    }

    public Optional<Locacao> findLocacaoById(Long id) {
        return this.locacaoDao.get(id);
    }
}
