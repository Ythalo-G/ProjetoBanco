package br.com.application;

import java.util.Scanner;

import br.com.call.ContaCorrente;
import br.com.call.ContaPoupanca;
import br.com.entitity.Banco;
import br.com.entitity.Cliente;
import br.com.entitity.Conta;

public class main {

	public static void main(String[] args) {

		Scanner digitar = new Scanner(System.in);

		Banco nome = new Banco();
		Cliente cliente = new Cliente();
		Conta poupanca = new ContaPoupanca(cliente);
		Conta corrente = new ContaCorrente(cliente);

		String r = "";

		System.out.println("            Bem vindo ao Banco " + nome.getNome());

		System.out.println("Vamos criar uma conta, digite os dados a seguir : ");
		System.out.print("Nome : ");
		String nomeC = digitar.next();
		cliente.setNome(nomeC);

		System.out.print(nomeC + " agora digite o seu  CPF  : ");
		Long cpf = digitar.nextLong();
		cliente.setCpf(cpf);

		System.out.print(nomeC + " digite sua idade: ");
		int idade = digitar.nextInt();
		cliente.setIdade(idade);

		System.out.print(
				"Agora digite o valor que deseja depositar: LEMBRANDO QUE O VALOR PRECISA SER ACIMA DE  R$50.00:  ");
		Double valor = digitar.nextDouble();
        poupanca.setSaldo(valor);
        corrente.setSaldo(valor);

		if (valor < 50.00) {
			System.out.println("VALOR DIGITADO ABAIXO DO PERMITIDO");
		} else {
			System.out.println("Digite a conta desejada :");
			System.out.println("1 - Conta Poupanca ");
			System.out.println("2 - Conta Corrente ");
			int op = digitar.nextInt();

			if (op == 1) {

				do {

					System.out.println("Serviços disponiveis:  ");
					System.out.println("1 - Sacar  ");
					System.out.println("2 - Depositar ");
					System.out.println("3 - Trasnferir ");
					System.out.println("Digite a opção desejada: ");
					int opcao = digitar.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("Digite o valor que deseja Sacar: R$");
						double valorS = digitar.nextDouble();
						poupanca.sacar(valorS);
						System.out.println("Deseja FINALIZAR : N - NÃO / S- SIM");
						r = digitar.next();
						break;

					case 2:
						System.out.println("Digite o valor que deseja Depositar: R$");
						double valorD = digitar.nextDouble();
						poupanca.depositar(valorD);
						System.out.println("Deseja FINALIZAR : N - NÃO / S- SIM");
						r = digitar.next();
						break;
					case 3:

						System.out.println("Digite o valor que deseja Transferir: R$");
						double valorT = digitar.nextDouble();
						poupanca.transferencia(valorT, corrente);
						System.out.println("Deseja FINALIZAR : N - NÃO / S- SIM");
						r = digitar.next();
						break;
					}

				} while (r == "N");
				poupanca.imprimirInfosComuns();

			} else if (op == 2) {

				do {

					System.out.println("Serviços disponiveis:  ");
					System.out.println("1 - Sacar  ");
					System.out.println("2 - Depositar ");
					System.out.println("3 - Trasnferir ");
					System.out.println("Digite a opção desejada: ");
					int opcao = digitar.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("Digite o valor que deseja Sacar: R$");
						double valorS = digitar.nextDouble();
						corrente.sacar(valorS);
						System.out.println("Deseja FINALIZAR : N - NÃO / S- SIM");
						r = digitar.next();
						break;

					case 2:
						System.out.println("Digite o valor que deseja Depositar: R$");
						double valorD = digitar.nextDouble();
						corrente.depositar(valorD);
						System.out.println("Deseja FINALIZAR : N - NÃO / S- SIM");
						r = digitar.next();
						break;
					case 3:

						System.out.println("Digite o valor que deseja Transferir: R$");
						double valorT = digitar.nextDouble();
						corrente.transferencia(valorT, poupanca);
						System.out.println("Deseja FINALIZAR : N - NÃO / S- SIM");
						r = digitar.next();
						break;
					}

				} while (r == "N");
				corrente.imprimirInfosComuns();
			} else {
				System.out.println("OPÇÃO INVALIDA!!");
			}
		}

	}

}
