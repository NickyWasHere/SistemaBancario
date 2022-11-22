package entities;

public class ClientePJ extends Cliente {

	private String cnpj;
	private Socio[] socios;
	private String razaoSocial;
	private String nomeFantasia;
	
	public ClientePJ(int numeroConta, String agencia, String telefone, double saldo, double limiteCheque, 
			String cnpj, Socio[] socios, String razaoSocial, String nomeFantasia) {
		super(numeroConta, agencia, telefone, saldo, limiteCheque);
		this.cnpj = cnpj;
		this.socios = socios;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Número da conta: " + this.getNumeroConta() + "\n");
		sb.append("Agência: " + this.getAgencia() + "\n");
		sb.append("Telefone: " + this.getTelefone() + "\n");
		sb.append(String.format("Saldo: R$ %.2f%n", this.getSaldo()));
		sb.append(String.format("Limite de cheque especial: %.2f%n", this.getLimiteCheque()));
		sb.append("CNPJ: " + this.getCnpj() + "\n");
		sb.append("Nome Fantasia: " + this.getNomeFantasia() + "\n");
		
		sb.append("Sócios:");
		for (Socio socio : socios) {
			sb.append(" " + socio.getNome());
		}
		sb.append("\n");
		
		sb.append("Razão social: " + this.getRazaoSocial() + "\n");
		
		return sb.toString();
	}

	public String getCnpj() {
		return cnpj;
	}

	public Socio[] getSocios() {
		return socios;
	}

	public void setSocios(Socio[] socios) {
		this.socios = socios;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
}
