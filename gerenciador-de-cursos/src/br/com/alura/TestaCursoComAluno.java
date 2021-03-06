package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando cole��es de Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArraysList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));
		
		Aluno a1 = new Aluno("Albert Santos", 32457);
		Aluno a2 = new Aluno("Guilherme Silveira", 12345);
		Aluno a3 = new Aluno("Mauricio Aniche", 54321);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			//System.out.println(a);
		});
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()) {
			System.out.println(iterador.next());
		};
		
		
		/*
		 * System.out.println("O aluno " + a1 + "esta matriculado");
		 * System.out.println(javaColecoes.EstaMatriculado(a1));
		 * 
		 * Aluno albert = new Aluno("Albert Santos", 32457);
		 * System.out.println(javaColecoes.EstaMatriculado(albert));
		 * 
		 * System.out.println("O a1 � equals ao Albert?");
		 * System.out.println(a1.equals(albert));
		 */
		
		
	}
}
