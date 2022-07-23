package Capitulo4_IntroducaoClassesObjetosMetodos;

//Essa classe declara um objeto de tipo vehicle 
public class TwoVehicles {
	public static void main(String[] args) {

		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		int range1, range2;
		
		//atribui valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelCap = 16;
		minivan.mpg = 21;
		
		//atribui valroes a campos de sportscar
		sportscar.passengers = 2;
		sportscar.fuelCap = 14;
		sportscar.mpg = 12;
		
		//Calcula a autonomia presumindo um tanque cheio de gasolina
		range1 = minivan.fuelCap * minivan.mpg;
		range2 = sportscar.fuelCap * sportscar.mpg;
		
		System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);
		System.out.println();
		System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2);
		
	}
}
