package Capitulo6_VerificacaoMinuciosaMetodosClasses;

/*Esta classe implementa um array "resistente a falhas" que 
 *impede a ocorrência de erros de tempo de execução.*/
public class FailSoftArray {

	private int a[]; // referencia ao array
	private int errVal; // valor a ser retornado se get() falhar
	private int length; // length é pública

	/*
	 * Constrói o array dados seu tamanho e o valor a ser retornado se get() falhar.
	 */
	public FailSoftArray(int size, int errv) {
		a = new int[size];
		errVal = errv;
		length = size;
	}

	// Retorna o valor do índice especificado.
	public int get(int index) {
		if (indexOK(index))
			return a[index]; // detecta índice fora dos limites.
		return errVal;
	}

	// Insere um valor em um índice. Retorna false em caso de falha.
	public boolean put(int index, int val) {
		if (indexOK(index)) {
			a[index] = val;
			return true;
		}
		return false;
	}

	// Retorna true se index estiver dentro dos limites
	private boolean indexOK(int index) {
		if (index >= 0 & index < length)
			return true;
		return false;
	}

}
