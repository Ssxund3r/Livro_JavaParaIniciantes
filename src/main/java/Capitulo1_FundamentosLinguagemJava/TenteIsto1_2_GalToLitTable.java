package Capitulo1_FundamentosLinguagemJava;

/*Este programa exibe uma tabela de conversões de galões em litros. */
public class TenteIsto1_2_GalToLitTable {
	public static void main(String[] args) {

		double gallons, liters;
		int counter;

		counter = 0; // Inicie o contador com zero
		
		for (gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854; // Converte para litros

			System.out.println(gallons + " gallons is " + liters + " liters.");

			counter++; // Incrementa o contador de linha a cada iteração do loop

			// a cada décima linha, exibe uma linha em branco
			if (counter == 10) {
				System.out.println();
				counter = 0; // Zera o contador de linhas
			}
		}

	}
}
