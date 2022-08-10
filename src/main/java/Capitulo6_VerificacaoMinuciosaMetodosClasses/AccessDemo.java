package Capitulo6_VerificacaoMinuciosaMetodosClasses;

public class AccessDemo {
	public static void main(String[] args) {

		Myclass ob = new Myclass();
		/*
		 * O acesso a alpha só é permitido por intermédio de seus métodos acessadores.
		 */
		ob.setAlpha(-99);
		System.out.println("ob.Alpha() is " + ob.getAlpha());

		// Você não pode acessar alpha dessa forma:
		// ob.alpha = 10; //Errado! alpha é privado!

		// Essas linahs estão corretas porque beta e gamma são públicos
		ob.beta = 88;
		ob.gamma = 99;

	}
}
