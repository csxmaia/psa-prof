public class consultar_placa {
    DadosCarro DadosCarro;
    ApiDetran api;

    BuscarDadosCarro() {}

    buscarPelaPlaca(String placa) {
        var dadosDoCarro = api.consultarPlaca(placa);
        return dadosDoCarro;
    }

    buscarPeloRenavam(String renavam) {
        var dadosDoCarro = api.consultarRenavam(renavam);
        return dadosDoCarro;
    }

    buscarPeloChassis(String chassis) {
        var dadosDoCarro = api.consultarChassis(chassis);
        return dadosDoCarro;
    }

}
