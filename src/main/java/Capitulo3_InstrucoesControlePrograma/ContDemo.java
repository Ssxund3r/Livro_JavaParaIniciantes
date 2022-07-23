package Capitulo3_InstrucoesControlePrograma;

//Usa continue
public class ContDemo {
	public static void main(String[] args) {
		int i;
		
		//exibe os números pares entre 0 e 100
		for (i = 0; i <= 100; i++) {
			if ((i % 2) != 0)
				continue; // iteração
			System.out.println(i);

		}
	}
}
