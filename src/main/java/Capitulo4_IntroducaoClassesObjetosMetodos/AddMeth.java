package Capitulo4_IntroducaoClassesObjetosMetodos;

public class AddMeth {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		// atribui os valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelCap = 16;
		minivan.mpg = 21;

		// atribui os valores a campos sportscar
		sportscar.passengers = 2;
		sportscar.fuelCap = 14;
		sportscar.mpg = 12;

		System.out.print("Minivan can carry " + minivan.passengers + ". ");

		minivan.range();

		System.out.print("Sportscar can carry " + sportscar.passengers + ". ");

		sportscar.range();

	}
}
