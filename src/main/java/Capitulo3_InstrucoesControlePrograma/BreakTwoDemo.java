package Capitulo3_InstrucoesControlePrograma;

import java.io.IOException;

//Lê a entrada até que um 'q' seja recebido
public class BreakTwoDemo {
	public static void main(String[] args) throws IOException {
		
		char ch;
		
		for( ; ; ) {
			ch = (char) System.in.read(); // Obtém um char
			if(ch == 'q') break; //Este laço 'infinito' é encerrado por break.
		}
		System.out.println("You pressed q!");
	}
}
