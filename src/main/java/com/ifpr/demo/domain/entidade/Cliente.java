package com.ifpr.demo.domain.entidade;

import com.ifpr.demo.domain.dados.DadosCliente;
import com.ifpr.demo.domain.erro.CnhInvalida;
import com.ifpr.demo.domain.erro.IdadeNaoPermitida;

import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	private String cpf;
	private CNH cnh;
	private Date dataNascimento;
	
	public Cliente() {}

	public Cliente(String nome, String email, String telefone, String cpf, CNH cnh, Date dataNascimento ) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.cnh = cnh;
		this.dataNascimento = dataNascimento;
	}
	
	public void cadastrar(DadosCliente dadosCliente) throws IdadeNaoPermitida, CnhInvalida {
		String nome = dadosCliente.getNome();
		String email = dadosCliente.getEmail();
		String telefone = dadosCliente.getTelefone();
		String cpf = dadosCliente.getCpf();
		Date dataNascimento = dadosCliente.getDataNascimento();
		
		if(!validarIdade()) {
			throw new IdadeNaoPermitida();
		}

		CNH cnh = this.cnh;

		if(!cnh.validarCNH()) {
			throw new CnhInvalida();
		}
		
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.cnh = cnh;
		this.dataNascimento = dataNascimento;
	}
	
	private boolean validarIdade() {
		int anoAtual = new Date().getYear();

		int anoNascimento = dataNascimento.getYear();

		int idade = anoAtual - anoNascimento;

		if (idade >= 21) {
			return true;
		} else {
			return false;
		}
	}
}