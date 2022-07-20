package Capitulo1_FundamentosLinguagemJava;

/*Este programa ilustra a diferença enre double e int*/
public class Example3 {
	public static void main(String[] args) {
		int var; // essa instrução declara a variável int
		double x; // essa instrução declara a variável de ponto flutuante

		var = 10; // Atribui a var o valor 10;

		x = 10.0; // Atribui o x o valor 10,0;

		System.out.println("Original value of var: " + var);
		System.out.println("Original value of x: " + x);
		System.out.println(); //Exibe um linha em branco

		// Agora divide as duas por 4
		var /= 4;
		x /= 4;
		
		System.out.println("var after division: " + var);
		System.out.println("x after division: " + x);

	}
}
