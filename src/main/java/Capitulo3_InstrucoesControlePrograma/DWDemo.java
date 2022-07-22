package Capitulo3_InstrucoesControlePrograma;

import java.io.IOException;

//Demonstra o laço do-while
public class DWDemo {
	public static void main(String[] args) throws IOException {

		char ch;

		do {
			System.out.println("Press a key followed by ENTER: ");
			ch = (char) System.in.read(); // Obtém um char
		} while (ch != 'q');

	}
}
