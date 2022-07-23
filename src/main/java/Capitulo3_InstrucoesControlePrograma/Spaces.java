package Capitulo3_InstrucoesControlePrograma;

import java.io.IOException;

//Conta espaços 
public class Spaces {
	public static void main(String[] args) throws IOException {

		int spaces = 0;
		char ch;

		System.out.println("Enter a period to stop.");

		do {
			ch = (char) System.in.read();
			if (ch == ' ')
				spaces++;
		} while (ch != '.');
		System.out.println("Shutting down...");
	}
}
