package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		//fluxo de entrada com arquivo
		/*
		 * OutputStream fos = new FileOutputStream("lorem2.txt"); Writer osw = new
		 * OutputStreamWriter(fos); BufferedWriter bw = new BufferedWriter(osw);
		 */
		
		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.newLine();
		bw.write("ljafjbfdjbd bjfdjkvbdjksF");
		
		
		bw.close();
		
	}

}
