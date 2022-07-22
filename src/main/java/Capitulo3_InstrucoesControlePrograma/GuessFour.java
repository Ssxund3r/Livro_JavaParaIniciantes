package Capitulo3_InstrucoesControlePrograma;

import java.io.IOException;

//Advinhe a letra do jogo - 4º versão
public class GuessFour {
	public static void main(String[] args) throws IOException {

		char ch, ignore, answer = 'k';

		do {

			System.out.println("I'm thinking of a letter between A and Z. ");
			System.out.print("Can you guess it: ");

			// lê caractere
			ch = (char) System.in.read();

			// descarta qualquer outro caractere do buffer de entrada
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');

			if (ch == answer)
				System.out.println("** RIGHT! S**");

			else {
				System.out.println("...Sorry, you're ");
				if (ch < answer)
					System.out.println("too low");
				else
					System.out.println("too hight");
				System.out.println("Try again!\n");
			}

		} while (answer != ch);

	}
}
