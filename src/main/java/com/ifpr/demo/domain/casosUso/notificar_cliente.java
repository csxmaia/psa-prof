public class notificar_cliente {
    
    DadosCliente dadosCliente;
    EnviarEmail email;

    NotificarCliente(this.dadosCliente) {
    //conversão de dados
    }

    enviarEmail() {
        var dadosEmail = DadosEmail(dadosCliente.email);
        email.enviar(dadosEmail);
    }
}


