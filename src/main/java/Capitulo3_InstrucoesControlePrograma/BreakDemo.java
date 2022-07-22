package Capitulo3_InstrucoesControlePrograma;

//Usando break para sair do laço
public class BreakDemo {
	public static void main(String[] args) {

		int num;
		num = 100;
		
		//executa o laço enquanto i ao quadrado é menor do que num
		for (int i = 0; i < num; i++) {
			if (i * i >= num) //Encerra o laço se i * i >= 100;
				break;
			System.out.println(i + " ");
		}
		System.out.println("Loop complete. ");
	}
}
