package Capitulo2_IntroducaoTiposDadosOperadores;

//Encontra os números primos entre 2 e 100
public class PrimeEx {
	public static void main(String[] args) {
		int i, j;
		boolean isPrime;

		for (i = 2; i < 100; i++) {
			isPrime = true;

			// vê se o número tem divisão exata
			for (j = 2; j <= i / j; j++)
				// se tiver, não é primo
				if ((i % j) == 0)
					isPrime = false;

			if (isPrime)
				System.out.println(i + " is prime. ");

		}
	}
}
