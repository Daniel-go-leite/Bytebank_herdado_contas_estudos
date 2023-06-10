package br.com.Bytebank.Banco.Modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia , int numero) {
		super(agencia,numero);
	
		}
      @Override
    public void saca(double valor)throws  SaldoInsuficenteException {
         double valorSacar = valor + 0.2;
    	  super.saca( valorSacar);
    }
	
  	public void deposita(double valor) {
		super.saldo +=valor;
	} 
      
      
      @Override
	public double getValorImposto() {
		
		return super.saldo * 0.01;
	}
  
   public String toString(){
	return "ContaCorrente , " + super.toString();
	   
   }


}
