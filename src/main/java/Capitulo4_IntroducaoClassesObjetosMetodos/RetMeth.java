package Capitulo4_IntroducaoClassesObjetosMetodos;

public class RetMeth {
	public static void main(String[] args) {

		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		int range1, range2;

		// atribui valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelCap = 16;
		minivan.mpg = 21;

		// atribui valores a campos de sportscar
		sportscar.passengers = 2;
		sportscar.fuelCap = 14;
		sportscar.mpg = 12;

		// obtém as autonomias
		range1 = minivan.rangeRet();
		range2 = sportscar.rangeRet();

		System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " miles");
		System.out.println("Sportscar can carry " + sportscar.passengers + " with range of " + range2 + " miles");
	}
}
