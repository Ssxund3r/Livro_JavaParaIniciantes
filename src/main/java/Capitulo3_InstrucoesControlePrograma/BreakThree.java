package Capitulo3_InstrucoesControlePrograma;

//Usando break com laços aninhados
public class BreakThree {
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			System.out.println("Outer loop count: " + i);
			System.out.print("	Inner loop count: ");

			int t = 0;

			while (t < 100) {
				if (t == 10)
					break; //Encerra o laço se t is 10 
				System.out.print(t + " "); 
				t++;
			}
			System.out.println();
		}
		System.out.println("Loops complete. ");
	}
}
