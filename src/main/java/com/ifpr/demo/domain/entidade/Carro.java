package com.ifpr.demo.domain.entidade;

import com.ifpr.demo.domain.dados.DadosCarro;
import com.ifpr.demo.domain.dados.TipoCombustivel;
import com.ifpr.demo.domain.erro.DadosInconsistentes;
import com.ifpr.demo.domain.erro.KmMaximaAtingida;
import com.ifpr.demo.domain.casosUso.ConsultarPlaca;

public class Carro {
    String modelo;
    double valorBaseLocacao;
    int quilometragem;
    int anoFabricacao;
    int anoModelo;
    String placa;
    int renavam;
    String chassis;
    String categoria;
    TipoCombustivel tipoCombustivel;
    int potenciaCv;
    boolean disponivel;

    public Carro(String modelo, double valorBaseLocacao, int quilometragem, int anoFabricacao,
                 int anoModelo, String placa, int renavam, String chassis, String categoria,
                 TipoCombustivel tipoCombustivel, int potenciaCv, boolean disponivel) {
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

    public void cadastrar(DadosCarro dadosCarro) throws DadosInconsistentes, KmMaximaAtingida {
        String modelo = dadosCarro.getModelo();
        double valorBaseLocacao = dadosCarro.getValorBaseLocacao();
        int quilometragem = dadosCarro.getQuilometragem();
        int anoFabricacao = dadosCarro.getAnoFabricacao();
        int anoModelo = dadosCarro.getAnoModelo();
        String placa = dadosCarro.getPlaca();
        int renavam = dadosCarro.getRenavam();
        String chassis = dadosCarro.getChassis();
        String categoria = dadosCarro.getCategoria();
        TipoCombustivel tipoCombustivel = dadosCarro.getTipoCombustivel();
        int potenciaCv = dadosCarro.getPotenciaCv();
        boolean disponivel = dadosCarro.getDisponivel();

        if (validarDadosSensiveis()) {
            throw new DadosInconsistentes();
        }

        if (validaKmMaxima(quilometragem)) {
            throw new KmMaximaAtingida();
        }

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

    private boolean validarDadosSensiveis() {
        DadosCarro dadosOficiais = new ConsultarPlaca().buscarPelaPlaca(placa);

        if (dadosOficiais.getAnoFabricacao() != anoFabricacao &&
                dadosOficiais.getAnoModelo() != anoModelo &&
                dadosOficiais.getPlaca() != placa &&
                dadosOficiais.getRenavam() != renavam &&
                dadosOficiais.getChassis() != chassis &&
                dadosOficiais.getTipoCombustivel() != tipoCombustivel) {
            return true;
        }
        return false;
    }

    private boolean validaKmMaxima(int quilometragem) {
        if (quilometragem >= 100000) {
            return true;
        }
        return false;
    }
}
