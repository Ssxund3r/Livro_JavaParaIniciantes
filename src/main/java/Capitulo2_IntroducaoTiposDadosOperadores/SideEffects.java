package Capitulo2_IntroducaoTiposDadosOperadores;

//Os efeitos colaterais podem ser importantes 
public class SideEffects {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i;

		i = 0;

		/* Aqui i é incrementado mesmo que a instrução if seja falsa */

		if (false & (++i < 100))
			System.out.println("This won't be displayed");
		System.out.println("if statement executed: " + i); // exibe 1

		/*
		 * Neste caso, i não incrementado porque o operador de curto-circuito iignora o
		 * incremento
		 */
		if (false && (++i < 100))
			System.out.println("This won't displayed");
		System.out.println("if statement executed: " + i); // Continua exibindo 1!

	}
}
