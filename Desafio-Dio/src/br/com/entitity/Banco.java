package br.com.entitity;

import java.util.List;

public class Banco {
	
	private static final int CODIGO_BANCO = 200;
	
	
	private String nome = "SANTANDER_BR";
	private Integer codigoBanco = CODIGO_BANCO;
	private List<Conta> contas;
	
    public Banco() {
    	
    }
	
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(Integer codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	
}
