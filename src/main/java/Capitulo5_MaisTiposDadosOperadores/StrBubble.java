package Capitulo5_MaisTiposDadosOperadores;

//Demonstra a classificação por bolha com strings.
public class StrBubble {
	public static void main(String[] args) {

		String strs[] = { "this", "is", "a", "test", "of", "a", "string", "sort" };

		int a, b;
		String t;
		int size;

		size = strs.length; // número de elementos a serem classificados

		// exibe o array original
		System.out.println("Original array is:");
		for (int i = 0; i < size; i++)
			System.out.print(" " + strs[i]);
		System.out.println();

		// Esta é a classificação por bolha de strings
		for (a = 1; a < size; a++)
			for (b = size; b >= a; b--) {
				if (strs[b-1].compareTo(strs[b]) > 0) { // se estiver na ordem
					// troca de elementos
					t = strs[b - 1];
					strs[b - 1] = strs[b];
					strs[b] = t;
				}
				
			}
		//exibe o array classificado
		System.out.println("Sorted arrays is:");
		for(int i=0; i < size; i++)
			System.out.println(" " + strs[i]);
		System.out.println();
	}
}
