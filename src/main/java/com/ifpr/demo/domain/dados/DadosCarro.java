package com.ifpr.demo.domain.dados;

import com.ifpr.demo.domain.dados.enums.DadosTipoCombustivelEnum;
import com.ifpr.demo.domain.entidade.Carro;

public class DadosCarro {

    private String modelo;
    private double valorBaseLocacao;
    private int quilometragem;
    private int anoFabricacao;
    private int anoModelo;
    private String placa;
    private int renavam;
    private String chassis;
    private String categoria;
    private DadosTipoCombustivelEnum tipoCombustivel;
    private int potenciaCv;
    private boolean disponivel;

    public DadosCarro(String modelo, double valorBaseLocacao, int quilometragem, int anoFabricacao, int anoModelo,
                      String placa, int renavam, String chassis, String categoria, DadosTipoCombustivelEnum tipoCombustivel,
                      int potenciaCv, boolean disponivel) {
        this.modelo = modelo;
        this.valorBaseLocacao = valorBaseLocacao;
        this.quilometragem = quilometragem;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.placa = placa;
        this.renavam = renavam;
        this.chassis = chassis;
        this.categoria = categoria;
        this.tipoCombustivel = tipoCombustivel;
        this.potenciaCv = potenciaCv;
        this.disponivel = disponivel;
    }

    public Carro dadosToEntity() {
        return new Carro(modelo,
                valorBaseLocacao,
                quilometragem,
                anoFabricacao,
                anoModelo,
                placa,
                renavam,
                chassis,
                categoria,
                tipoCombustivel.toTipoCombustivelEnum(),
                potenciaCv,
                disponivel);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorBaseLocacao() {
        return valorBaseLocacao;
    }

    public void setValorBaseLocacao(double valorBaseLocacao) {
        this.valorBaseLocacao = valorBaseLocacao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public DadosTipoCombustivelEnum getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(DadosTipoCombustivelEnum tipoCombustivelEnum) {
        this.tipoCombustivel = tipoCombustivelEnum;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
