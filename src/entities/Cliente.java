package entities;

public abstract class Cliente {
	private int numeroConta;
	private String agencia;
	private String telefone;
	private double saldo;
	private double limiteCheque;
	
	public Cliente(int numeroConta, String agencia, String telefone, double saldo, double limiteCheque) {
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.telefone = telefone;
		this.saldo = saldo;
		this.limiteCheque = limiteCheque;
	}
	
	public void aumentaSaldo(double valor) {
		if (valor>0) {
			this.saldo += valor;
		}
	}
	
	public void diminuiSaldo(double valor) {
		if (valor>0 && this.saldo-valor>=0) {
			this.saldo -= valor;
		}
	}
	
	public void aumentaLimite(double valor) {
		if (valor>0) {
			this.limiteCheque += valor;
		}
	}
	
	public void diminuiLimite(double valor) {
		if (valor>0 && this.limiteCheque-valor>=0) {
			this.limiteCheque -= valor;
		}
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimiteCheque() {
		return limiteCheque;
	}

	public void setLimiteCheque(double limiteCheque) {
		this.limiteCheque = limiteCheque;
	}
}
