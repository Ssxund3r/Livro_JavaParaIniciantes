package Capitulo5_MaisTiposDadosOperadores;

//Encontra a média de 10 valores double.
public class Avg {
	public static void main(String[] args) {

		double nums[] = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1 };
		double sum = 0;

		for (int i = 0; i < 10; i++) 
			sum += nums[i];

		System.out.println("Average: " + sum / nums.length);
	}
}
