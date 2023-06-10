package br.com.Bytebank.Banco.Teste;

import br.com.Bytebank.Banco.Modelo.Clinte;
import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;

public class TestArrayReferencias {
 
	public static void main(String[] args) {
		
	Object[] referencias = new Object[5];
	
	ContaCorrente cc1 = new ContaCorrente(22,11);
    referencias[0] = cc1;
		
    ContaPoupanca cc2 = new ContaPoupanca(22,22);	
	referencias[1] = cc2;	
	
	Clinte cliente = new Clinte();
	referencias[2] = cliente;
	
	//Conta ref = contas[0];
	
	ContaPoupanca ref = (ContaPoupanca)referencias[1];//type cast.
	System.out.println(cc2.getNumero());
	System.out.println(ref.getNumero());
	
	}
	
}
