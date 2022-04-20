package br.com.call;

import br.com.entitity.Cliente;
import br.com.entitity.Conta;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		super.imprimirInfosComuns();
	}
}
