package util;

public class Banco {
	private double valorConta;
	private String nomeConta;
	private int numConta;
	
	public Banco(String nomeConta, int numConta) {
		this.nomeConta = nomeConta;
		this.numConta = numConta;
		valorConta = 0;
		
	}
	

	public double getValorConta() {
		return valorConta;
	}
	
	
	public String getNomeConta() {
		return nomeConta;
	}
	
	
	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}
	
	public void depositar(double deposito) {
		valorConta += deposito;
	}
	
	public void sacar(double saque) {
		valorConta = valorConta - saque -(5);
	}
	
	public String toString() {
		return "Conta " +
						numConta +
						", Nome: "
						+nomeConta
						+", Valor: $" +
						String.format("%.2f", valorConta);
							
	}
	

	
	
	
	
	
	
	
}
