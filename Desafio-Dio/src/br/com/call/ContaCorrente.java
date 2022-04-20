package br.com.call;

import br.com.entitity.Cliente;
import br.com.entitity.Conta;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("*********** EXTRATO **********");
		super.imprimirInfosComuns();
	}
}

