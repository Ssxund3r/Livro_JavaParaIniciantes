package Capitulo5_MaisTiposDadosOperadores;

public class Queue {
	char q[]; // Esse array contém a fila
	int putloc, getloc; // os índices put e get

	public Queue(int size) {
		q = new char[size]; // Aloca a memória para fila
		putloc = getloc = 0;
	}

	// Insere um caracter na fila
	void put(char ch) {
		if (putloc == q.length) {
			System.out.println("- Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}

	// obtém um caractere na fila
	char get() {
		if (getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;

		}
		return q[getloc++];
	}

}
