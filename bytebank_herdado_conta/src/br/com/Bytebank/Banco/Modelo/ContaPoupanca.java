package br.com.Bytebank.Banco.Modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia,numero);
	}

	@Override
	public void deposita(double valor) {
	
		
	}
	public String toString(){
		return "ContaPoupanca , " + super.toString() ;
		   
	   }

}
