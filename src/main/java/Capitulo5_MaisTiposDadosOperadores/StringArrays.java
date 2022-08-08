package Capitulo5_MaisTiposDadosOperadores;

//Demostra arrays de Strings. 
public class StringArrays {
	public static void main(String[] args) {
		String strs[] = { "This", "is", "a", "test." };

		System.out.println("Original array: ");
		for (String s : strs)
			System.out.print(s + " ");
		System.out.println("\n");

		// altera um string
		strs[1] = "was";
		strs[2] = "test, too!";

		System.out.println("Modified array: ");
		for (String s : strs)
			System.out.print(s + " ");

	}
}
