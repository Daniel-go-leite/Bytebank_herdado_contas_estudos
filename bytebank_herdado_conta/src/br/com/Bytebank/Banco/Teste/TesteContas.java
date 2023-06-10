package br.com.Bytebank.Banco.Teste;

import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;
import br.com.Bytebank.Banco.Modelo.SaldoInsuficenteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficenteException {
		
	ContaCorrente CC = new ContaCorrente(111, 111);
	CC.deposita(100.0);
	
	ContaPoupanca CP = new ContaPoupanca(222,222);
	CP.deposita(200.0);
	
	CC.transfere(20.0, CP);
	
	System.out.println("CC:" + CC.getSaldo());
	System.out.println("CP:" + CP.getSaldo());
	
		
		
	}

}
