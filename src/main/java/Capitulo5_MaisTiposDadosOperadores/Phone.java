package Capitulo5_MaisTiposDadosOperadores;

//Uma lista telefônica simples automatizada.
public class Phone {
	public static void main(String[] args) {

		String numbers[][] = { { "Tom", "555-3322" }, { "Bibo", "555-8976" }, { "Marroco", "555-1037" },
				{ "Rachel", "555-1400" }, };

		int i;
		/*
		 * para o programa ser usado, um argumento de linha de comnado deve estar
		 * /presente.
		 */
		if (args.length != 3)
			System.out.println("Usage: java phone <name>");
		else {
			for (i = 0; i < numbers.length; i++) {
				if (numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0] + ": " + numbers[i][1]);
					break;
				}
			}
			if (i == numbers.length)
				System.out.println("Name not found!");
		}

	}
}
