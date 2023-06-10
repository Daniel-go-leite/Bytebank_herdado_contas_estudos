package br.com.Bytebank.Banco.Teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.Bytebank.Banco.Modelo.Clinte;
import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;

//Código omitido

public class TesteOrdencao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Clinte clienteCC1 = new Clinte();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Clinte clienteCC2 = new Clinte();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Clinte clienteCC3 = new Clinte();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Clinte clienteCC4 = new Clinte();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

		// NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		// lista.sort(null);

		lista.sort(new TitularDaContaComparator());

		Collections.sort(lista);

		System.out.println("---------");

		for (Conta conta : lista) {
			System.out.println(conta + " ," + conta.getTitular().getNome());
		}

	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		return nomeC1.compareTo(nomeC2);

	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		return (int) (c1.getNumero() - c2.getNumero());

		// return Integer.compare(c1.getNumero(), c2.getNumero());

		// if (c1.getNumero() < c2.getNumero()) {
		// return -1;
		// }

		// if (c1.getNumero() > c2.getNumero()) {
		// return 1;
		// }

		// return 0;
	}
}
