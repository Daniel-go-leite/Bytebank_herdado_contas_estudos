package br.com.Bytebank.Banco.Teste;

import br.com.Bytebank.Banco.Modelo.CalculadorDeImposto;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;
import br.com.Bytebank.Banco.Modelo.SeguroDevida;

public class TesteTributavesis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
	    cc.deposita(100.0);
	    
	    SeguroDevida seguro = new SeguroDevida();
	    
	    CalculadorDeImposto calc = new CalculadorDeImposto();
	    calc.registro(cc);
	    calc.registro(seguro);
	
	    System.out.println(calc.getTotalImposto());
	    
	}
}
