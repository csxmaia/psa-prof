package com.ifpr.demo.domain.casosUso;

import com.ifpr.demo.domain.dados.DadosCliente;
import com.ifpr.demo.domain.portas.EnviarEmail;

public class NotificarCliente {
    
    DadosCliente dadosCliente;
    EnviarEmail email;

    public NotificarCliente(DadosCliente dadosCliente) {
    //conversão de dados
    }

    public void enviarEmailBoasVindas(DadosCliente dadosCliente) {
        EnviarEmailCliente enviarEmailCliente = new EnviarEmailCliente(dadosCliente);

        String conteudoEmail = montaEmailBoasVindas(dadosCliente);

        enviarEmailCliente.enviarEmail("Boas vindas", conteudoEmail);
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


