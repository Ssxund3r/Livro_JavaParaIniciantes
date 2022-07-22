package Capitulo3_InstrucoesControlePrograma;

import java.io.IOException;

//Advinhe a letra do jogo
public class Guess {
	public static void main(String[] args) throws IOException {

		char ch, answer = 'k';
		
		System.out.println("I'm thinking of a letter between A and Z. ");
		System.out.println("Can you guess it: ");
		
		ch = (char) System.in.read(); //lê um char no teclado 
		
		if(ch == answer)
			System.out.println("*** Right! *** ");
	}
}
