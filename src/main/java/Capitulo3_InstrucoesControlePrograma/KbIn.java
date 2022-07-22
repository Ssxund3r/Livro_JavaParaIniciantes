package Capitulo3_InstrucoesControlePrograma;

import java.io.IOException;

//LÊ um caractere no teclado.
public class KbIn {
	public static void main(String[] args) throws IOException {
		char ch;

		System.out.println("Press any key followed by ENTER: ");
		ch = (char) System.in.read(); // Obtém um char -> lê um caractere no teclado

		System.out.println("Your key is: " + ch);
	}
}
