package Capitulo5_MaisTiposDadosOperadores;

public class ArrayErr {
	public static void main(String[] args) {

		int sample[] = new int[10];
		int min, max;

		min = max = sample[0];
		for (int i = 0; i < 100; i = i + 1)
			sample[i] = i;

	}
}
