package app;

import java.util.Locale;
import java.util.Scanner;

import util.Banco;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o número da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Qual é o nome do responsavel? ");
		String nomeConta = sc.nextLine();
		
		System.out.println("Quer fazer um deposito inicial? (y/n)");
		String enter = sc.nextLine();
		
		Banco banco = new Banco(nomeConta, numConta);
		
		
		if (enter.equals("y")) { //comparar String com CHAR
			System.out.println("Digite o valor do deposito inicial: ");
			double deposito = sc.nextDouble();
			banco.depositar(deposito);
			
			System.out.println("Informações da conta: ");
			System.out.println(banco);
			System.out.println();
			
			System.out.println("Entre com uma quantia para deposito: ");
			deposito = sc.nextDouble();
			banco.depositar(deposito);
			sc.nextLine();
			
			System.out.println("Informações atualizadas: ");
			System.out.println(banco);
			System.out.println();
			
			System.out.println("Atualize o nome: ");
			String nomeAtt = sc.nextLine();
			banco.setNomeConta(nomeAtt);
			
			System.out.println("Informações atualizadas: ");
			System.out.println(banco);
			System.out.println();
			
			System.out.println("Entre com uma quantia para sacar: ");
			double saque = sc.nextDouble();
			
			banco.sacar(saque);
			System.out.println("Informações atualizadas: ");
			System.out.println(banco);
		
		} else {
			
			System.out.println("Informações da conta: ");
			System.out.println(banco);
			System.out.println();
			
			System.out.println("Entre com uma quantia para deposito: ");
			double deposito = sc.nextDouble();
			
			banco.depositar(deposito);
			System.out.println("Informações atualizadas: ");
			System.out.println(banco);
			sc.nextLine();
			System.out.println();
			
			System.out.println("Atualize o nome: ");
			String nomeAtt = sc.nextLine();
			banco.setNomeConta(nomeAtt);
			
			System.out.println("Informações atualizadas: ");
			System.out.println(banco);
			System.out.println();
			
			System.out.println("Entre com uma quantia para sacar: ");
			double saque = sc.nextDouble();
			
			banco.sacar(saque);
			System.out.println("Informações atualizadas: ");
			System.out.println(banco);
		}
		
		
		
		
		
		
		sc.close();
		
	}

}
