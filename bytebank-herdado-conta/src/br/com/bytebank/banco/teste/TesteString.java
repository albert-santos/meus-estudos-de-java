package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura";//object literal
		
		
		String vazio = "   Alura   ";
		String outrovazio = vazio.trim();
		
		System.out.println(outrovazio.contains("lu"));
		
		System.out.println(outrovazio.isEmpty());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(nome.length());
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		int posicao = nome.indexOf("ur");
		System.out.println(posicao);
		
		char c = nome.charAt(2);
		System.out.println(c);
		
		String outra = nome.replace('A', 'a');
		
		System.out.println(nome);
		System.out.println(outra);
		
	}
}
