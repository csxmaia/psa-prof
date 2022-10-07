public class registrar_cliente {
    DadosCliente dadosCliente;
    Cliente cliente;
    ClienteRepositorio repositorio;
    EnviarEmail email;

    RegistrarCliente(this.dadosCliente) {
        cliente = Cliente.cadastrar(dadosCliente);
        var notificar = NotificarCliente(dadosCliente);
        if (repositorio.salvar(dadosCliente)) {
        	notificar.enviarEmail();
        }
    }
}
