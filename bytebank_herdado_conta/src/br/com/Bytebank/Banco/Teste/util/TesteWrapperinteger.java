package br.com.Bytebank.Banco.Teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperinteger {
 public static void main(String[] args) {
	
	 int[] idades = new int[5];
	
	 String[] nomes =new String[5];
	 
	 int idade =29;//Integer
	
	 Integer idadeRef =  Integer.valueOf(29);
	
	String s = args[0];
	 Integer numero = Integer.valueOf(s);
	 System.out.println(numero);
	 
	 
	 
	 List<Integer>numeros = new ArrayList<Integer>();
	 numeros.add(Integer.valueOf(29));//Autoboxing
}
}
