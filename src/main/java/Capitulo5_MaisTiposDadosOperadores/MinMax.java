package Capitulo5_MaisTiposDadosOperadores;

//Encontra o valor mínino e máximo de um array
public class MinMax {
	public static void main(String[] args) {

		int num[] = new int[10];
		int min, max;

		num[0] = 99;
		num[1] = -10;
		num[2] = 100123;
		num[3] = 18;
		num[4] = -978;
		num[5] = 5623;
		num[6] = 463;
		num[7] = -9;
		num[8] = 287;
		num[9] = 49;

		min = max = num[0];

		for (int i = 1; i < 10; i++) {
			if (num[i] < min)
				min = num[i];
			if (num[i] > max)
				max = num[i];
		}
		System.out.println("min and max: " + min + " -- " + max);

	}
}
