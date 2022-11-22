package entities;

public class ClientePF extends Cliente {

	private String cpf;
	private String nome;
	private int idade;
	
	public ClientePF(int numeroConta, String agencia, String telefone, double saldo, double limiteCheque, String cpf,
			String nome, int idade) {
		super(numeroConta, agencia, telefone, saldo, limiteCheque);
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Número da conta: " + this.getNumeroConta() + "\n");
		sb.append("Agência: " + this.getAgencia() + "\n");
		sb.append("Telefone: " + this.getTelefone() + "\n");
		sb.append(String.format("Saldo: R$ %.2f%n", this.getSaldo()));
		sb.append(String.format("Limite de cheque especial: %.2f%n", this.getLimiteCheque()));
		sb.append("CPF: " + this.getCpf() + "\n");
		sb.append("Nome: " + this.getNome() + "\n");
		sb.append("Idade: " + this.getIdade() + "\n");
		return sb.toString();
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
