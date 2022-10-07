package com.ifpr.demo.domain.dados;

import com.ifpr.demo.domain.entidade.Cliente;

import java.util.Date;

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
              cnh.dadosToEntity(),
              dataNascimento);
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public DadosCnh getCnh() {
        return cnh;
    }

    public void setCnh(DadosCnh cnh) {
        this.cnh = cnh;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}