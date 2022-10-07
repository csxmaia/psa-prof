package com.ifpr.demo.domain.dados;

import com.ifpr.demo.domain.entidade.Locacao;

import java.util.Date;


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

	public DadosLocacao(DadosCarro carro,
						DadosCliente cliente,
						Date dataLocacao,
						double quilometragemLocacao,
						double valorCalcao,
						double valorLocacao,
						boolean devolvido,
						Date dataDevolucao,
						double quilometragemDevolucao) {
		this.carro = carro;
		this.cliente = cliente;
		this.dataLocacao = dataLocacao;
		this.quilometragemLocacao = quilometragemLocacao;
		this.valorCalcao = valorCalcao;
		this.valorLocacao = valorLocacao;
		this.devolvido = devolvido;
		this.dataDevolucao = dataDevolucao;
		this.quilometragemDevolucao = quilometragemDevolucao;
	}

	public Locacao dadosToEntity() {
		return new Locacao(
				carro.dadosToEntity(),
				cliente.dadosToEntity(),
				dataLocacao,
				quilometragemLocacao,
				valorCalcao,
				valorLocacao,
				devolvido,
				dataDevolucao,
				quilometragemDevolucao
		);
	}

	public DadosCarro getCarro() {
		return carro;
	}

	public void setCarro(DadosCarro carro) {
		this.carro = carro;
	}

	public DadosCliente getCliente() {
		return cliente;
	}

	public void setCliente(DadosCliente cliente) {
		this.cliente = cliente;
	}

	public Date getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public double getQuilometragemLocacao() {
		return quilometragemLocacao;
	}

	public void setQuilometragemLocacao(double quilometragemLocacao) {
		this.quilometragemLocacao = quilometragemLocacao;
	}

	public double getValorCalcao() {
		return valorCalcao;
	}

	public void setValorCalcao(double valorCalcao) {
		this.valorCalcao = valorCalcao;
	}

	public double getValorLocacao() {
		return valorLocacao;
	}

	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}

	public boolean isDevolvido() {
		return devolvido;
	}

	public void setDevolvido(boolean devolvido) {
		this.devolvido = devolvido;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public double getQuilometragemDevolucao() {
		return quilometragemDevolucao;
	}

	public void setQuilometragemDevolucao(double quilometragemDevolucao) {
		this.quilometragemDevolucao = quilometragemDevolucao;
	}
}