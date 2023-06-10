package br.com.Bytebank.Banco.Modelo;

public class GuardadorDeContas {

	private Conta[] refencias;
	private int posicaoLivre;
	
	
	public GuardadorDeContas() {
		 this.refencias = new Conta[10];
	     this.posicaoLivre = 0;
	}
	 
	 public void adiciona(Conta ref) {
		 this.refencias[this.posicaoLivre] = ref;
	     this.posicaoLivre ++;
	 }

	public int getQuantidadeDeElementos() {
		
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
	
		return this.refencias[pos];
	}
	
	
	
	
	
}
