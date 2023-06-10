package br.com.Bytebank.Banco.Teste;

import br.com.Bytebank.Banco.Modelo.Clinte;
import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(3);
		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
        Clinte  cliente = new Clinte(); 
		
		System.out.println(cc);
		System.out.println(cp);

		println();
	}

	static void println() {}
	static void println(int a) {}
    static void println(boolean valor) {}

	static void println(Object conta) {}

	
}
