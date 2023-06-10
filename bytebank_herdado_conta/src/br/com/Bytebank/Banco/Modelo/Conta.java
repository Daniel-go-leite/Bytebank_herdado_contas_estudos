package br.com.Bytebank.Banco.Modelo;


/**
 * 
 * Classe representa a moldura de uma conta.
 * 
 * @author Daniel Gomes Leite
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>{

	protected double saldo;
	private int agencia;
	private int numero;
	private Clinte titular;
	private static int total;

	public Conta(int agencia, int numero) {

		Conta.total++;
		// System.out.println("o total de contas e " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// System.out.println("estou criando uma conta" + this.numero);
	}

	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficenteException {
		
		if (this.saldo < valor) {
			throw new SaldoInsuficenteException("Saldo" + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino)throws SaldoInsuficenteException {
		this.saca(valor);
			destino.deposita(valor);

			
	}

	public double getSaldo() {
		return this.saldo;

	}

	public double getNumero() {
		return this.numero;

	}

	public void setNumero(int nume) {
		if (numero <= 0) {
			System.out.println("nao pode menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (numero <= 0) {
			System.out.println("nao pode valor menor igual a 0");
		}

		this.agencia = agencia;
	}

	public void setTitular(Clinte titular) {
		this.titular = titular;
	}

	public Clinte getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}

	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
	    if(this.numero != outra.numero) {
	    	return false;
	    }
	        return true;
	}
	
	
	public int compareTo(Conta outro) {
		return Double.compare(this.saldo, outro.saldo);
	}
	
	
	
	public String toString(){
			return " Nume: " + this.numero + ", Agencia:" + this.agencia +  ""
					+ " ,Saldo: "  +  this.saldo;
	 }		   
}
