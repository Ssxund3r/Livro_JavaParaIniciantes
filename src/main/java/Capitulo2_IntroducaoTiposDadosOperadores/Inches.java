package Capitulo2_IntroducaoTiposDadosOperadores;

/*Calcula quantas polegadas cúbicas há em uma linha cúbica.*/
public class Inches {
	public static void main(String[] args) {

		long ci, im;

		im = 5280 * 12;
		ci = (long) Math.pow(im, 3);

		System.out.println(" There are " + ci + " cubic inches in cubic mile.");

	}
}
