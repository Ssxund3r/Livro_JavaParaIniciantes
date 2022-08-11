package Capitulo6_VerificacaoMinuciosaMetodosClasses;

//Tipos primitivos são passados por valor.
public class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	/*
	 * Passa um objeto, agora os valores ob.a e ob.b do objeto usados na chamada
	 * serão alterados.
	 */
	void change(Test ob) {
		ob.a = ob.a + ob.b;
		ob.b = -ob.b;
	}

	/* Este método não causa alteração nos argumentos usados na chamada. */
	void noChange(int i, int j) {
		i += j;
		j = -j;
	}
}
