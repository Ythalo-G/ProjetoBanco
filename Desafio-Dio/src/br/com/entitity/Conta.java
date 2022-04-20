package br.com.entitity;

public class Conta {
	
	private static int SEQUENCIAL = 0001;
	
	protected int agencia = 1235;
	protected int numero;
	protected double saldo;
	protected double limite;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.numero = SEQUENCIAL ++;
		this.cliente = cliente;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		if(valor > this.saldo ) {
			this.saldo += valor;
			this.limite = this.saldo * 2;
		}else {
			this.saldo += valor;
			this.limite +=valor;
		}
		
	}
	public void transferencia(double valor, Conta conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void imprimirInfosComuns() {
		 System.out.println("************************************************** EXTRATO ********************************************");
		 System.out.println(String.format("                                    Titutlar: %s", this.cliente.getNome()));
	     System.out.println(String.format("                                    Agencia: %d", this.agencia));
	     System.out.println(String.format("                                    Numero: %d", this.numero));
	     System.out.println(String.format("                                    Saldo: %.2f", this.saldo));
	     System.out.println(String.format("                                    Limite: %.2f", this.limite));
	}

}
