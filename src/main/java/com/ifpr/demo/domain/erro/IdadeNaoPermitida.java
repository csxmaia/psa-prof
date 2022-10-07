public class IdadeNaoPermitida extends ErroGenerico {
    public ErroGenerico(String errorMessage) {
        super("Idade não permitida, você possui menos de 21 anos!");
    }
}