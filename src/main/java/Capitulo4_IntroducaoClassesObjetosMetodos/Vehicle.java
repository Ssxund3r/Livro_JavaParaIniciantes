package Capitulo4_IntroducaoClassesObjetosMetodos;

//Um programa que usa a classe Vehicle.
public class Vehicle {

	int passengers; // número de passageiros
	int fuelCap; // capacidade de armazenamento de combustível em galões
	int mpg; // consumo de combustível em milhas por galão

	// Exibe a autonomia void
	void range() {
		System.out.println("Range is " + fuelCap * mpg);
	}

	// Exibe a autonomia return
	int rangeRet() {
		return mpg * fuelCap;
	}

}
