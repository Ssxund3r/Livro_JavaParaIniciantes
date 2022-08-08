package Capitulo5_MaisTiposDadosOperadores;

//Usa subString()
public class Substr {
	public static void main(String[] args) {
		String orgstr = "Java makes the web move.";

		// Constrói um subString
		String substr = orgstr.substring(5, 18);

		System.out.println("orgstr: " + orgstr);
		System.out.println("substr: " + substr);

	}
}
