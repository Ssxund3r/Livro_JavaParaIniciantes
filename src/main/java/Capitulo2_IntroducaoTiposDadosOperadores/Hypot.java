package Capitulo2_IntroducaoTiposDadosOperadores;

/*Usa o teorema de pitágoras para encontrar o comprimento 
 *da hipotenusa dados os comprimentos dos dois lados opostos.*/
public class Hypot {
	public static void main(String[] args) {
		double x, y, z;

		x = 3;
		y = 4;
		// Observe que sqrt() é chamado. Ele é precedido pelo nome da classe da qual é
		// chamado.
		z = Math.sqrt(x * x + y * y);

		System.out.println("Hypotenuse: " + z);
	}
}
