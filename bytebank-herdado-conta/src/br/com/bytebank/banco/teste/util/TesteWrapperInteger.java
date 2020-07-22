package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int idade = 29; //Interger
		
		Integer idadeRef = Integer.valueOf(29);//autoboxing
		System.out.println(idadeRef.doubleValue());
		
		int valor = idadeRef.intValue();//unboxing
		System.out.println(valor);
		
		String s = args[0];// "10"
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);	
		
		
		
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(idade);//Autoboxing

	}

}
