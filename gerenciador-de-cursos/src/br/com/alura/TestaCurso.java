package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando coleções de Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArraysList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
        
		System.out.println(javaColecoes.getAulas());
		
	}
}
