package Capitulo3_InstrucoesControlePrograma;

//Retira mais uma parte do laço for
public class EmptyTwo {
	public static void main(String[] args) {

		int i = 0;
	
		for (; i < 10;) {
			System.out.println("Pass # " + i);
			i++; //Incrementa a variável de controle de laço
		}
	}
}
