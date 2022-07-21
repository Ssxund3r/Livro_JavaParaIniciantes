package Capitulo2_IntroducaoTiposDadosOperadores;

/*1. Crie um novo arquivo chamado LogicalOpTable.java
 *2. A fim de assegurar que as colunas fiquem alinhadas, você usará a sequência de
 *escape \t para embutir tabulações em cada string de saída. Por exemplo, a instrução
 *println() exibe o cabeçalho da tabela
 *3. Cada linha subsequente da tabela usará tabulações para que o resultado de cada operação 
 *seja posicionado sob o título apropriado
 */
public class LogicalOpTable {
	public static void main(String[] args) {

		boolean p, q;

		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		p = true;
		q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = true;
		q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = false;
		q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = false;
		q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

	}
}
