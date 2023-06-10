package br.com.Bytebank.Banco.especial;

import br.com.Bytebank.Banco.Modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia , int numero) {
		super(agencia,numero);
	}
	
	 public void deposita(double valor) {
	  super.saldo += valor;
  }

}
