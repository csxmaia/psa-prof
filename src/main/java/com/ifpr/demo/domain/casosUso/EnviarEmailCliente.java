package com.ifpr.demo.domain.casosUso;

import com.ifpr.demo.domain.dados.DadosLocacao;
import org.springframework.beans.factory.annotation.Autowired;

import com.ifpr.demo.domain.dados.DadosCliente;
import com.ifpr.demo.domain.dados.DadosEmail;
import com.ifpr.demo.domain.portas.EnviarEmail;

public class EnviarEmailCliente {
    DadosCliente dadosCliente;

    @Autowired
    EnviarEmail email;

    EnviarEmailCliente(DadosCliente dadosCliente) {
        this.dadosCliente = dadosCliente;
    }

    void enviarEmail(String assunto, String conteudo) {
        DadosEmail dadosEmail = new DadosEmail();
        dadosEmail.setAssunto(assunto);
        dadosEmail.setConteudo(conteudo);
        dadosEmail.setDestinatario(this.dadosCliente.getEmail());

        email.enviar(dadosEmail);
    }

    String montaEmailBoasVindas(DadosCliente dadosCliente) {
        return "Olá, " + dadosCliente.getNome() + "\n" +
                "Seja muito bem vindo, obrigado por locar com a gente!" +
                "Os seus dados estão logo abaixo: \n\n" +
                "============================///============================" +
                "Nome: " + dadosCliente.getNome() + "\n" +
                "Telefone: " + dadosCliente.getTelefone() + "\n" +
                "Data de nascimento:" + dadosCliente.getDataNascimento() + "\n" +
                "CPF: " + dadosCliente.getCpf() + "\n" +
                "============================///============================" +
                "Qualquer dúvida ou problema, nos contate 0800 300 0500" + "\n" +
                "Obrigado por locar conosco!!!";


    }
}


