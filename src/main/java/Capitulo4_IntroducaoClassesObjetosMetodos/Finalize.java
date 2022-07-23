package Capitulo4_IntroducaoClassesObjetosMetodos;

public class Finalize {
	public static void main(String[] args) {
		int count;

		FDemo ob = new FDemo(0);

		/*
		 * Agora, gere um grande número de obejtos. Em alguns momento, a coleta de lixo
		 * ocorrerá. Nota: você pode ter de aumentar o número de obejtos gerados para
		 * forçar a coleta de lixo.
		 */
		for (count = 1; count < 100000; count++)
			ob.generator(count);

	}
}
