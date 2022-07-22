package Capitulo3_InstrucoesControlePrograma;

import java.io.IOException;

//Tente isto 3-1 - um sistema de ajuda básica
public class Help {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

		char choice;

		System.out.println("Help on: ");
		System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.print("Choose one:");

		choice = (char) System.in.read();

		System.out.println("\n");

		switch (choice) {
		case 1:
			System.out.println("The if:\n");
			System.out.println("if(condition) statement;");
			System.out.println("else statement;");
			break;
		case 2:
			System.out.println("The switch:\n");
			System.out.println("switch(expression) {");
			System.out.println(" case constant:");
			System.out.println("	statement sequence");
			System.out.println("	break;");
			System.out.println("	//	...");
			System.out.println("}");
			break;
		default:
			System.out.println("Selection not found.");
		}

	}
}
