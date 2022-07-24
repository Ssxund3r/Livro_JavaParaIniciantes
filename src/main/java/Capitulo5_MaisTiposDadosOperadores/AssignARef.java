package Capitulo5_MaisTiposDadosOperadores;

//Atribuindo variaveis de referência de array
public class AssignARef {
	public static void main(String[] args) {

		int num1[] = new int[10];
		int num2[] = new int[10];
		int i;

		for (i = 0; i < 10; i++)
			num1[i] = i;

		for (i = 0; i < 10; i++)
			num2[i] = -i;

		System.out.print("Here is nums1: ");
		for (i = 0; i < 10; i++)
			System.out.print(num1[i] + " ");
		System.out.println();

		System.out.print("Here is nums2: ");
		for (i = 0; i < 10; i++)
			System.out.print(num2[i] + " ");
		System.out.println();

		num2 = num1; // agora num2 referencia num1

		System.out.print("Here is num2 after assignment: ");
		for (i = 0; i < 10; i++)
			System.out.print(num2[i] + " ");
		System.out.println();

		// agora opera do array num1 ao num2
		num2[3] = 99;

		System.out.print("Here is num1 after change throught num2: ");
		for (i = 0; i < 10; i++)
			System.out.print(num1[i] + " ");
		System.out.println();

	}
}
