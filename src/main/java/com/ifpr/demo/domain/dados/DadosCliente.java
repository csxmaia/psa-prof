package com.ifpr.demo.domain.dados;

import com.ifpr.demo.domain.entidade.Cliente;

public class DadosCliente {
  private String nome;
  private String email;
  private String telefone;
  private String cpf;
  private DadosCnh cnh;
  private Date dataNascimento;

  public DadosCliente(String nome, String email, String telefone, String cpf, DadosCnh cnh, Date dataNascimento) {
	  this.nome = nome;
	  this.email = email;
	  this.telefone = telefone;
	  this.cpf = cpf;
	  this.cnh = cnh;
	  this.dataNascimento = dataNascimento;
  }
  
  public Cliente dadosToEntity() {
      return new Cliente(nome,
              email,
              telefone,
              cpf,
              cnh,
              dataNascimento);
  }
  
  
  
}