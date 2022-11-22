package SistemaBancario;

import java.util.Scanner;

import entities.Cliente;
import entities.ClientePF;
import entities.ClientePJ;
import entities.Socio;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente[] clientes = new Cliente[50];
		boolean flag = true;
		
		while (flag) {
			UI.menu();
			int resposta = sc.nextInt();
			
			switch(resposta) {
			case 1:
				UI.tipoCliente();
				resposta = sc.nextInt();
				
				if (resposta==1) {
					cadastrarCliente(clientes, "PF", sc);
				} else if (resposta==2) {
					cadastrarCliente(clientes, "PJ", sc);
				}
				break;
				
			case 2:
				System.out.print("Número da conta do cliente: ");
				int numConta = sc.nextInt();
				
				int pos = getPosition(clientes, numConta);
				
				if (checkConta(clientes, numConta)) {
					System.out.println();
					System.out.println(clientes[pos]);
					
				}
				
				break;
				
			case 3:
				System.out.println("Clientes: ");
				System.out.println();
				
				
				for (Cliente cliente : clientes) {
					if (cliente!=null) {
						System.out.println(cliente);
					}
				}
				break;
				
			case 4:
				System.out.print("Número da conta de origem: ");
				int origem = sc.nextInt();
				
				System.out.print("Número da conta de destino: ");
				int destino = sc.nextInt();
				
				System.out.print("Valor a ser transferido: ");
				double valor = sc.nextDouble();
				
				int posOrigem = getPosition(clientes, origem);
				int posDestino = getPosition(clientes, destino);
				
				if (checkConta(clientes, origem) && checkConta(clientes, destino) 
					&& valor<clientes[posOrigem].getSaldo() && origem!=destino) {
					
					clientes[posOrigem].diminuiSaldo(valor);
					clientes[posDestino].aumentaSaldo(valor);
					System.out.println("Transferência realizada");
				}
				
				break;
				
			case 5:
				UI.tipoSaldo();
				resposta = sc.nextInt();
				
				System.out.print("Número da conta do cliente: ");
				numConta = sc.nextInt();
				
				pos = getPosition(clientes, numConta);
				
				System.out.print("Valor: ");
				valor = sc.nextDouble();
				
				if (resposta==1 && checkConta(clientes, numConta)) {
					clientes[pos].aumentaSaldo(valor);
				} else if (resposta==2 && checkConta(clientes, numConta)) {
					clientes[pos].diminuiSaldo(valor);
				}
				break;
				
			case 6:
				UI.tipoLimite();
				resposta = sc.nextInt();
				
				System.out.print("Número da conta do cliente: ");
				numConta = sc.nextInt();
				
				pos = getPosition(clientes, numConta);
				
				System.out.print("Valor: ");
				valor = sc.nextDouble();
				
				if (resposta==1 && checkConta(clientes, numConta)) {
					clientes[pos].aumentaLimite(valor);
				} else if (resposta==2 && checkConta(clientes, numConta)) {
					clientes[pos].diminuiLimite(valor);
				}
				break;
				
			case 7:
				System.out.print("Número da conta: ");
				numConta = sc.nextInt();
				
				if (checkConta(clientes, numConta)) {
					removerCliente(clientes, numConta);
				}
				break;
				
			case 8:				
				flag = false;
				break;
				
			default:
				break;
			}
		}
		
		sc.close();
	}
	
	public static void cadastrarCliente(Cliente[] clientes, String tipo, Scanner sc) {
		int pos = 0;
		
		for (int i=0; i<clientes.length; i++) {
			if (clientes[i]==null) {
				pos = i;
				break;
			}
		}
		
		System.out.println("Cadastrar novo cliente");
		System.out.println();
		
		System.out.print("Número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Agência: ");
		String agencia = sc.next();
		System.out.print("Telefone: ");
		String telefone = sc.next();
		System.out.print("Saldo: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de cheque especial: ");
		double limiteCheque = sc.nextDouble();
		
		if (tipo=="PF") {			
			System.out.print("CPF: ");
			String cpf = sc.next();
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			clientes[pos] = new ClientePF(numeroConta, agencia, telefone, 
					saldo, limiteCheque, cpf, nome, idade);
			
		} else if (tipo=="PJ") {
			
			System.out.print("CNPJ: ");
			String cnpj = sc.next();
			
			System.out.print("Nome dos sócios: ");
			sc.nextLine();
			String nomes = sc.nextLine();
			String[] vect = nomes.split(" ");
			Socio[] socios = new Socio[3];
			
			for (int i=0; i<vect.length; i++) {
				socios[i] = new Socio(vect[i]);
			}
			
			System.out.print("Razão social: ");
			String razaoSocial = sc.next();
			System.out.print("Nome fantasia: ");
			String nomeFantasia = sc.next();	
			
			clientes[pos] = new ClientePJ(numeroConta, agencia, telefone, 
					saldo, limiteCheque, cnpj, socios, razaoSocial, nomeFantasia);
			
		}
		
		System.out.println();
		System.out.println("Cliente adicionado");
	}
	
	public static void removerCliente(Cliente[] clientes, int numeroConta) {
		for (int i=0; i<clientes.length; i++) {
			if (numeroConta==clientes[i].getNumeroConta()) {
				clientes[i] = null;
				break;
			}
		}
		
		System.out.println();
		System.out.println("Cliente removido");
	}
	
	private static int getPosition(Cliente[] clientes, int numeroConta) {
		for (int i=0; i<clientes.length; i++) {
			if (numeroConta==clientes[i].getNumeroConta()) {
				return i;
			}
		}
		
		return 0;
	}
	
	private static boolean checkConta(Cliente[] clientes, int numeroConta) {
		for (int i=0; i<clientes.length; i++) {
			if (clientes[i].getNumeroConta()==numeroConta) {
				return true;
			}
		}
		return false;
	}

}
