package Capitulo5_MaisTiposDadosOperadores;

//Usa XOR para codificar e decodificar uma mensagem.
public class Encode {
	public static void main(String[] args) {

		String msg = "This is a test.";
		String enMsg = "";
		String decMsg = "";
		int key = 88;

		System.out.println("Original message: ");
		System.out.println(msg);

		// codifica a mensagem
		for (int i = 0; i < msg.length(); i++)
			enMsg += (char) (msg.charAt(i) ^ key);

		System.out.println("Encoded message: ");
		System.out.println(enMsg);

		// decodifica a mensagem
		for (int i = 0; i < msg.length(); i++)
			decMsg += (char) (enMsg.charAt(i) ^ key);

		System.out.println("Decoded message: ");
		System.out.println(decMsg);

	}
}
