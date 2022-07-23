package Capitulo4_IntroducaoClassesObjetosMetodos;

public class CompFuel {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		double gallons;
		int dist = 252;

		// atribui valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelCap = 16;
		minivan.mpg = 21;

		// atribui valroes a campos de sportscar
		sportscar.passengers = 2;
		sportscar.fuelCap = 14;
		sportscar.mpg = 12;

		gallons = minivan.fuelNeeded(dist);

		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");

		gallons = sportscar.fuelNeeded(dist);

		System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel.");

	}
}
