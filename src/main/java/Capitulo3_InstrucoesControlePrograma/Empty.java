package Capitulo3_InstrucoesControlePrograma;

//Partes de for podem estar vazias
public class Empty {
	public static void main(String[] args) {

		int i;

		for (i = 0; i < 10;) {
			System.out.println("Pass # " + i);
			i++; //incrementa a variável de controle de laço
		}

	}
}
