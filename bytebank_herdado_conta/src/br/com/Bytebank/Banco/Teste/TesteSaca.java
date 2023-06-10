package br.com.Bytebank.Banco.Teste;

import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.SaldoInsuficenteException;

public class TesteSaca {

	public static void main(String[] args) {
		
	Conta conta = new ContaCorrente(123, 321);
	
	conta.deposita(200.0);
	try {
	conta.saca(210.0);
	}catch(SaldoInsuficenteException ex) {
		System.out.println(ex.getMessage()); 
	}
	System.out.println(conta.getSaldo());
	
	}

}
