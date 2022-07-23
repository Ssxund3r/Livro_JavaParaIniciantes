package Capitulo3_InstrucoesControlePrograma;

//Usa continue
public class ContDemo {
	public static void main(String[] args) {
		int i;

		for (i = 0; i <= 100; i++) {
			if ((i % 2) != 0)
				continue; // iteração
			System.out.println(i);

		}
	}
}
