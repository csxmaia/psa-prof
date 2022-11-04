package com.ifpr.demo.domain.adaptador;

import com.ifpr.demo.domain.dados.DadosCliente;
import com.ifpr.demo.domain.entidade.CNH;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ClienteEntidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column()
    private String nome;

    @Column()
    private String email;

    @Column()
    private String telefone;

    @Column()
    private String cpf;

    @Column()
    private CNH cnh;

    @Column()
    private Date dataNascimento;

    public ClienteEntidade() {

    }

    public ClienteEntidade(DadosCliente dadosCliente) {
        this.nome = dadosCliente.getNome();
        this.email = dadosCliente.getEmail();
        this.telefone = dadosCliente.getTelefone();
        this.cpf = dadosCliente.getCpf();
        this.cnh = dadosCliente.getCnh().toEntity();
        this.dataNascimento = dadosCliente.getDataNascimento();
    }

    public DadosCliente toDadosCliente() {
        DadosCliente cliente = new DadosCliente(
                nome,
                email,
                telefone,
                cpf,
                cnh.dadosToDadosCNH(),
                dataNascimento
        );
        return cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public CNH getCnh() {
        return cnh;
    }

    public void setCnh(CNH cnh) {
        this.cnh = cnh;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
