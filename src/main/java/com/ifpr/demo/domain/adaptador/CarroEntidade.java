package com.ifpr.demo.domain.adaptador;

import javax.persistence.*;

import com.ifpr.demo.domain.dados.DadosCarro;
import com.ifpr.demo.domain.dados.enums.DadosTipoCombustivelEnum;

@Entity
public class CarroEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column()
    private String modelo;

    @Column()
    private double valorBaseLocacao;

    @Column()
    private int quilometragem;

    @Column()
    private int anoFabricacao;

    @Column()
    private int anoModelo;

    @Column()
    private String placa;

    @Column()
    private int renavam;

    @Column()
    private String chassis;

    @Column()
    private String categoria;

    @Column()
    private DadosTipoCombustivelEnum tipoCombustivel;

    @Column()
    private int potenciaCv;

    @Column()
    private boolean disponivel;

    public CarroEntidade() {

    }

    public CarroEntidade(DadosCarro dadosCarro) {
        this.modelo = dadosCarro.getModelo();
        this.valorBaseLocacao = dadosCarro.getValorBaseLocacao();
        this.quilometragem = dadosCarro.getQuilometragem();
        this.anoFabricacao = dadosCarro.getAnoFabricacao();
        this.anoModelo = dadosCarro.getAnoFabricacao();
        this.placa = dadosCarro.getPlaca();
        this.renavam = dadosCarro.getRenavam();
        this.chassis = dadosCarro.getChassis();
        this.categoria = dadosCarro.getCategoria();
        this.tipoCombustivel = dadosCarro.getTipoCombustivel();
        this.potenciaCv = dadosCarro.getPotenciaCv();
        this.disponivel = dadosCarro.getDisponivel();
    }

    public DadosCarro toDadosCarro() {
        DadosCarro carro = new DadosCarro(
                modelo,
                valorBaseLocacao,
                quilometragem,
                anoFabricacao,
                anoModelo,
                placa,
                renavam,
                chassis,
                categoria,
                tipoCombustivel,
                potenciaCv,
                disponivel
        );
        return carro;
    }
}
