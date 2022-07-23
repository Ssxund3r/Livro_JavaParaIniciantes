package Capitulo3_InstrucoesControlePrograma;

//É importante onde o rótulo é inserido 
public class BreakSixDemo {
	public static void main(String[] args) {

		int x = 0, y = 0;

		// Aqui, insira o rótulo antes da instrução for.
		stop1: for (x = 0; x < 5; x++) {
			for (y = 0; y < 5; y++) {
				if (y == 2)
					break stop1;
				System.out.println("x and y: " + x + " --- " + y);
			}
		}

		System.out.println();

		// Agora, insira o rótulo imediatamente antes de { for(x=0; x <5; x++;)
		 	for(x=0; x < 5; x++)
		stop2: {
			for (y = 0; y < 5; y++) {
				if (y == 2)
					break stop2;
				System.out.println("x and y: " + x + " --- " + y);
			}
		}

	}
}
