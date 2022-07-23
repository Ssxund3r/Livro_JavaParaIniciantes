package Capitulo4_IntroducaoClassesObjetosMetodos;

public class Pwr {

	double b;
	double val;
	int e;

	public Pwr(double base, int exp) {
		b = base;
		e = exp;

		val = 1;
		if (exp == 0)
			return;
		for (; exp > 0; exp--)
			val *= base;
	}

	double get_pwr() {
		return val;
	}

}
