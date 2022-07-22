package Capitulo3_InstrucoesControlePrograma;

//Declara a variavel de controle de laço dentro de for
public class ForVar {
	public static void main(String[] args) {

		int sum = 0;
		int fact = 1;

		// Calcula a fatorial dos números até 5
		for (int i = 0; i <= 5; i++) {
			sum += i; // i é conhecida em todo laço
			fact *= i;
		}

		// Mas não é conhecida aqui
		System.out.println("Sum is " + sum);
		System.out.println("Factorial is " + fact);

	}
}
