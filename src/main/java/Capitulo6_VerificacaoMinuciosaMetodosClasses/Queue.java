package Capitulo6_VerificacaoMinuciosaMetodosClasses;

//Uma classe de fila de caracteres melhorada
public class Queue {
	// agora esses membros são privados
	private char q[]; // Esse array contém a fila
	private int putLoc, getLoc; // os indices put e get

	public Queue(int size) {
		q = new char[size]; // aloca memória para a fila
		putLoc = getLoc = 0;
	}

	// insere um caractere na fila.
	void put(char ch) {
		if (putLoc == q.length) {
			System.out.println(" - Queue is full. ");
			return;
		}
		q[putLoc++] = ch;
	}

	// Obtém um caractere na fila.
	char get() {
		if (getLoc == putLoc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return q[getLoc++];
	}

}
