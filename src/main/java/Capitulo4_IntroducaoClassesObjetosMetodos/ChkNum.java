package Capitulo4_IntroducaoClassesObjetosMetodos;

//Um exemplo simples que usa um parametro 
public class ChkNum {

	// retorna true se 'x' for par
	boolean isEven(int x) { // Aqui, 'x' é um parametro inteiro de isEven().
		if ((x % 2) == 0)
			return true;
		else
			return false;
	}
}
