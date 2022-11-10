package entities;

public class ClientePJ extends Cliente {

	private String cnpj;
	private Socio[] socios;
	private String razaoSocial;
	private String nomeFantasia;
	
	public ClientePJ(int numeroConta, String agencia, String telefone, double saldo, double limiteCheque, String cnpj,
			Socio[] socios, String razaoSocial, String nomeFantasia) {
		super(numeroConta, agencia, telefone, saldo, limiteCheque);
		this.cnpj = cnpj;
		this.socios = socios;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
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
