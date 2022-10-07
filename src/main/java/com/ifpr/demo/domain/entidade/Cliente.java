public class Cliente {
	private long id;
	private String email;
	private String telefone;
	private String cpf;
	private CNH cnh;
	private Date dataNascimento;
	
	private boolean validarIdade() {
		int anoAtual = DateTime.now().year;

	    int anoNascimento = dataNascimento.year;

	    int idade = anoAtual - anoNascimento;
	    if (idade >= 21) {
	      return true;
	    } else {
	      return false;
	    }
	}
}