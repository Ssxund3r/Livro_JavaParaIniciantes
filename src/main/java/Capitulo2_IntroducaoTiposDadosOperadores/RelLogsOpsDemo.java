package Capitulo2_IntroducaoTiposDadosOperadores;

//Demonstra os oepradores relacionais e lógicos. 
public class RelLogsOpsDemo {
	public static void main(String[] args) {

		int i, j;
		boolean b1, b2;

		i = 10;
		j = 11;

		if (i < j)
			System.out.println("i < j");
		if (i <= j)
			System.out.println("i <= j");
		if (i != j)
			System.out.println("i != j");
		if (i == j)
			System.out.println("This won't execute!");
		if (i >= j)
			System.out.println("This won't execute!");
		if (i > j)
			System.out.println("This won't execute!");

		b1 = true;
		b2 = false;

		if (b1 & b2)
			System.out.println("This won't execute!");
		if (!(b1 & b2))
			System.out.println("!(b1 & b2) is true");
		if (b1 | b2)
			System.out.println("b1 | b2 is true");
		if (b1 ^ b2)
			System.out.println("b1 ^ b2 is true");

	}
}
