package br.com.Bytebank.Banco.Teste.util;

import java.util.ArrayList;

import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;

public class TesteArrayListEquais {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(22, 22);
		lista.add(cc3);
		
		
		boolean existe = lista.contains(cc3);
		System.out.println("Ja existe?" + existe);
		
	    
		
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
