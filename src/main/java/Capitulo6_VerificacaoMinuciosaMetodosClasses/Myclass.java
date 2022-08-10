package Capitulo6_VerificacaoMinuciosaMetodosClasses;

//Acesso publico vs privado
public class Myclass {
	private int alpha; // acesso privado
	public int beta; // acesso púbblico
	int gamma; // acesso padrão

	/*
	 * Métodos para acessar alpha, não há problema em um membro de uma classe
	 * acessar um membro privaod da mesma classe
	 */
	void setAlpha(int a) {
		alpha = a;
	}

	int getAlpha() {
		return alpha;
	}
	
	

}
