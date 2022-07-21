package Capitulo2_IntroducaoTiposDadosOperadores;

//Demonstra a conversão automática de long para double 
public class LtoDdemo {
	public static void main(String[] args) {

		long L;
		double D;

		L = 100123285L;
		D = L; // Conversão automática de long para double

		System.out.println("L and D: " + L + " --- " + D);

	}
}
