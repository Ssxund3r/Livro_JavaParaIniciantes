package Capitulo5_MaisTiposDadosOperadores;

//Codificação XOR melhorada
public class EncodeEx {
	public static void main(String[] args) {

		String msg = "This is a test";
		String encMsg = "";
		String decMsg = "";
		String key = "abcdefgh";
		int j;

		System.out.println("Original message: ");
		System.out.println(msg);

		// codifica a mensagem
		j = 0;
		for (int i = 0; i < msg.length(); i++) {
			encMsg += (char) (msg.charAt(i) ^ key.charAt(j));
			j++;
			if (j == 8)
				j = 0;
		}

		System.out.println("Encoded message: ");
		System.out.println(encMsg);

		// decodifica a mensagem
		j = 0;
		for (int i = 0; i < msg.length(); i++) {
			decMsg += (char) (encMsg.charAt(i) ^ key.charAt(j));
			j++;
			if (j == 8)
				j = 0;
		}
		
		System.out.println("Decoded message: ");
		System.out.println(decMsg);

	}
}
