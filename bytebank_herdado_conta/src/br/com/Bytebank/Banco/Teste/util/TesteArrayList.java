package br.com.Bytebank.Banco.Teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(33, 311); 
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33, 322);
		lista.add(cc4);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = (Conta) lista.get(0);

		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
       
		System.out.println("-------------");
		
		for(Object oRef :lista) {
        	System.out.println(oRef);
        }
	}

}
