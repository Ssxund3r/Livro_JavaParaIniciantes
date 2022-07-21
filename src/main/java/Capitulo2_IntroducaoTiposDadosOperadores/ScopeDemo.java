package Capitulo2_IntroducaoTiposDadosOperadores;

public class ScopeDemo {
	public static void main(String[] args) {
		int x; // conhecida pelo código dentro de main()

		x = 10;

		if (x == 10) { // Inicia um novo escopo
			int y = 20; // conhecida apenas neste bloco

			// tanto x quanto y são conhecidas aqui

			System.out.println("x and y: " + x + " " + y);
		}

		// y = 100; //erro não é conhecida aqui!

		// x ainda é conhecido aqui.
		System.out.println("x is " + x);
	}
}
