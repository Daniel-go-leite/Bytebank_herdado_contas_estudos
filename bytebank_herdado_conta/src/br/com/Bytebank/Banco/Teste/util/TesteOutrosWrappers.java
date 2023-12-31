package br.com.Bytebank.Banco.Teste.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
  
	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);//autoboxing
		System.out.println(idadeRef.intValue());// unboxing
		
		Double dRef = Double.valueOf(3.2);//autoboxing
		System.out.println(dRef.doubleValue());//unboxing
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
	
	    List<Number> lista = new ArrayList<>();
	    lista.add(10);
	    lista.add(32.6);
	    lista.add(25.6f);
	
	    System.out.println(lista);
	}
	
}
