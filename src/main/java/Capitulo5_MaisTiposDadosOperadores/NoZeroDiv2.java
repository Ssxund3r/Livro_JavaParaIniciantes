package Capitulo5_MaisTiposDadosOperadores;

//impede uma divisão por zero usando o operado ?.
public class NoZeroDiv2 {
	public static void main(String[] args) {

		for (int i = -5; i < 6; i++) {
			if (i != 0 ? true : false)
				System.out.println("100 / " + i + " is " + 100 / i);
		}

	}
}
