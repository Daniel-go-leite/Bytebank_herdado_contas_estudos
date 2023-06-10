package br.com.Bytebank.Banco.Teste;

import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		
		GuardadorDeContas guardado = new GuardadorDeContas();
		
		  Conta cc = new ContaCorrente(22,11);
		  guardado.adiciona(cc);
	
		  Conta cc2 = new ContaCorrente(22,22);
		  guardado.adiciona(cc2);
	
	      int tamanho = guardado.getQuantidadeDeElementos();
	      System.out.println(tamanho);
	
	      Conta ref = guardado.getReferencia(1);
	      System.out.println(ref.getNumero());
	
	}
	
	
}
