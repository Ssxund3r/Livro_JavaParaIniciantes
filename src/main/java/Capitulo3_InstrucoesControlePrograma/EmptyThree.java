package Capitulo3_InstrucoesControlePrograma;

//O corpo de um laço pode estar vazio
public class EmptyThree {
	public static void main(String[] args) {

		int i, sum = 0;

		// soma os números até 5
		for (i = 1; i <= 5; sum += i++) ; //Não há corpo neste laço

		System.out.println("Sum is " + sum);

	}
}
