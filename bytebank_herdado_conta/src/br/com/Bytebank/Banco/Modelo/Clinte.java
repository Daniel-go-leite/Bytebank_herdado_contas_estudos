package br.com.Bytebank.Banco.Modelo;

/**
 * 
 * Classe que representa um clinte no Bytebank.
 * 
 * 
 * @author Daniel Gomes Leite
 * @version 0.1
 */




public class Clinte {

	private String nome;
	private String CPF;
	private String profissao;
	 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
