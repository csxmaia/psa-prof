package com.ifpr.demo.domain.dados;

import com.ifpr.demo.domain.entidade.Locacao;


public class DadosLocacao {
	DadosCarro carro;
	DadosCliente cliente;
	Date dataLocacao;
	double quilometragemLocacao;
	double valorCalcao;
	double valorLocacao;
	boolean devolvido;
	Date dataDevolucao;
	double quilometragemDevolucao;
	
	public DadosLocacao(DadosCarro carro, DadosCliente cliente, Date dataLocacao, double quilometragemLocacao, double valorcalcao, double valorLocacao, boolean devolvido, Date dataDevolucao, double quilometragemDevolucao) {
		this.carro = carro;
		this.cliente = cliente;
		this.dataLocacao = dataLocacao;
		this.quilometragemLocacao = quilometragemLocacao;
		this.valorCalcao = valorCalcao;
		this.devolvido = devolvido;
		this.dataDevolucao = dataDevolucao;
		this.quilometragemDevolucao = quilometragemDevolucao;
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
				tipoCombustivel,
				potenciaCv,
				disponivel);			
	}
	
	
}