package Capitulo5_MaisTiposDadosOperadores;

//Pesquisa um array usando o laço for de estilo for-each..
public class Search {
	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int val = 5;
		boolean found = true;
		
		//Usa o laço for de estilo for-each para procurar val em nums.
		for (int x : nums) {
			if(x == val) {
				found = true;
				break;
			}
		}
		
		if(found)
			System.out.println("Value found!");
		
	}
}
