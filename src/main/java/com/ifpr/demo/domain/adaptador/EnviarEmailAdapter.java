package com.ifpr.demo.domain.adaptador;

import com.ifpr.demo.domain.dados.DadosEmail;
import com.ifpr.demo.domain.portas.EnviarEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class EnviarEmailAdapter implements EnviarEmail {

    @Autowired
    private JavaMailSender envioEmailDoJava;

    @Override
    public void enviar(DadosEmail dadosEmail) {

        SimpleMailMessage email = new SimpleMailMessage();

        email.setTo(dadosEmail.getDestinatario());
        email.setSubject(dadosEmail.getAssunto());
        email.setText(dadosEmail.getConteudo());

        try {
            envioEmailDoJava.send(email);
        } catch (Exception e) {
            throw e;
        }
    }
    
}