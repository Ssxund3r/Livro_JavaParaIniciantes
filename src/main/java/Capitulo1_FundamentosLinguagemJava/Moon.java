package Capitulo1_FundamentosLinguagemJava;

/*Calcule seu peso na lua */
public class Moon {
	public static void main(String[] args) {

		double earthWeight; //Peso na terra 
		double moonWeight; //Peso na lua

		earthWeight = 195; 
		moonWeight = earthWeight * 0.17; 

		System.out.println(
				earthWeight + " earth-pounds is equivalent to " + String.format("%.2f", moonWeight) + " moon-pounds.");

	}
}
