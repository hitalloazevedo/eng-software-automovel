package com.mycompany.alocacao_veiculos.model;

public class Automovel {
    private String placa;
    private String cor;
    private int nroPortas;
    private TipoCombustivel tipoCombustivel;
    private long quilometragem;
    private long renavam;
    private String chassi;
    private double valorLocacao;
    private Modelo modelo;

    public Automovel(String placa, String cor, int nroPortas, TipoCombustivel tipoCombustivel, long quilometragem, long renavam, String chassi, double valorLocacao) {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia.");
        }
        if (nroPortas <= 0) {
            throw new IllegalArgumentException("O número de portas deve ser maior que zero.");
        }
        if (valorLocacao < 0) {
            throw new IllegalArgumentException("O valor de locação não pode ser negativo.");
        }

        this.placa = placa;
        this.cor = cor;
        this.nroPortas = nroPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quilometragem = quilometragem;
        this.renavam = renavam;
        this.chassi = chassi;
        this.valorLocacao = valorLocacao;
    }

    // Getters e Setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia.");
        }
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNroPortas() {
        return nroPortas;
    }

    public void setNroPortas(int nroPortas) {
        if (nroPortas <= 0) {
            throw new IllegalArgumentException("O número de portas deve ser maior que zero.");
        }
        this.nroPortas = nroPortas;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(long quilometragem) {
        if (quilometragem < 0) {
            throw new IllegalArgumentException("A quilometragem não pode ser negativa.");
        }
        this.quilometragem = quilometragem;
    }

    public long getRenavam() {
        return renavam;
    }

    public void setRenavam(long renavam) {
        this.renavam = renavam;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        if (valorLocacao < 0) {
            throw new IllegalArgumentException("O valor de locação não pode ser negativo.");
        }
        this.valorLocacao = valorLocacao;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovel{" +
                "placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", nroPortas=" + nroPortas +
                ", tipoCombustivel=" + tipoCombustivel +
                ", quilometragem=" + quilometragem +
                ", renavam=" + renavam +
                ", chassi='" + chassi + '\'' +
                ", valorLocacao=" + valorLocacao +
                ", modelo=" + (modelo != null ? modelo.toString() : "N/A") +
                '}';
    }

    // Enum para TipoCombustivel
    public enum TipoCombustivel {
        GASOLINA,
        ETANOL,
        DIESEL,
        GNV,
        ELETRICO
    }
}
