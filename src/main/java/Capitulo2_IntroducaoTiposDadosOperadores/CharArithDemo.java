package Capitulo2_IntroducaoTiposDadosOperadores;

public class CharArithDemo {
	public static void main(String[] args) {

		char ch;

		ch = 'X';
		System.out.println("ch contains: " + ch);

		System.out.println();

		ch++; // um char pode ser incrementado
		System.out.println("ch is now! " + ch);
		
		System.out.println();
		
		ch = 90; // Dá a char o valor z -> um char pode receber um valor inteiro
		System.out.println("ch is now " + ch);

	}
}
