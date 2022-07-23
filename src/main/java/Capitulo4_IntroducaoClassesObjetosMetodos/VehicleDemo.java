package Capitulo4_IntroducaoClassesObjetosMetodos;

//Essa classe declara um objeto de tipo Vehicle
public class VehicleDemo {
	public static void main(String[] args) {

		Vehicle minivan = new Vehicle();
		int range;

		// Atribui valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelCap = 16; // Observe o uso do operador ponto para o acesso a um membro.
		minivan.mpg = 21;

		// Calcula a autonomia presumido um tanque cheio de gasolina
		range = minivan.fuelCap * minivan.mpg;
		System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range);

	}
}
