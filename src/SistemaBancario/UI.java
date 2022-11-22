package SistemaBancario;

public class UI {
	
	public static void menu() {		
		System.out.println();
		System.out.println("Sistema Bancário");
		System.out.println();
		
		System.out.println("1-Adicionar cliente");
		System.out.println("2-Ver cliente");
		System.out.println("3-Ver todos os clientes");
		System.out.println("4-Realizar transferência");
		System.out.println("5-Alterar saldo");
		System.out.println("6-Alterar limite do cheque especial");
		System.out.println("7-Remover cliente");
		System.out.println("8-Sair");
		System.out.println();
		
		System.out.print("Digite sua resposta: ");
		
		
	}
	
	public static void tipoCliente() {	
		System.out.println();
		System.out.println("Escolha um tipo de cliente para adicionar");
		System.out.println();
		
		System.out.println("1-Pessoa Física");
		System.out.println("2-Pessoa Jurídica");
		System.out.println();
		
		System.out.print("Digite sua resposta: ");
	}
	
	public static void tipoSaldo() {
		System.out.println();
		System.out.println("Escolha uma opção");
		System.out.println();
		
		System.out.println("1-Aumentar saldo");
		System.out.println("2-Diminuir saldo");
		System.out.println();
		
		System.out.print("Digite sua resposta: ");
	}
	
	public static void tipoLimite() {	
		System.out.println();
		System.out.println("Escolha uma opção");
		System.out.println();
		
		System.out.println("1-Aumentar limite");
		System.out.println("2-Diminuir limite");
		System.out.println();
		
		System.out.print("Digite sua resposta: ");
	}
}
