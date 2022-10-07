public class Cliente {
	private String nome;
	private String email;
	private String telefone;
	private String cpf;
	private CNH cnh;
	private Date dataNascimento;
	
	public Cliente(String nome, String email, String telefone, String cpf, CNH cnh, Date dataNascimento ) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.cnh = cnh;
		this.dataNascimento = dataNascimento;
	}
	
	public void cadastrar(DadosCliente dadosCliente) throws validarIdade {
		String nome = dadosCliente.getNome();
		String email = dadosCliente.getEmail();
		String telefone = dadosCliente.getTelefone();
		String cpf = dadosCliente.getCpf();
		
		if(validaridade()) {
			throw new validarIdade();
		}
		if(validarCNH()) {
			throw new validarCNH();
		}
		
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.cnh = cnh;
		this.dataNascimento = dataNascimento;
	}
	
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