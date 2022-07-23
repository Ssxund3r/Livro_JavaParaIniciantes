package Capitulo4_IntroducaoClassesObjetosMetodos;

//Um programa que usa a classe Vehicle.
public class Vehicle {

	int passengers; // número de passageiros
	int fuelCap; // capacidade de armazenamento de combustível em galões
	int mpg; // consumo de combustível em milhas por galão

	// Esse é um construtor para Vehicle.
	Vehicle(int p, int f, int m) {
		passengers = p;
		fuelCap = f;
		mpg = m;
	}
	
	//Exibe construtor vazio para não gerar erro nas classes anteriores
	Vehicle() {

	}

	// Exibe a autonomia void
	void range() {
		System.out.println("Range is " + fuelCap * mpg);
	}

	// Exibe a autonomia return
	int rangeRet() {
		return mpg * fuelCap;
	}

	// Calcula o combostível necessário para cobrir uma determinada distância.
	double fuelNeeded(int miles) {
		return (double) miles / mpg;
	}

}
