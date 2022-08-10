package Capitulo5_MaisTiposDadosOperadores;

//Demonstra ShowBits.
public class ShowBitsDemo {
	public static void main(String[] args) {

		ShowBitsService b = new ShowBitsService(8);
		ShowBitsService i = new ShowBitsService(32);
		ShowBitsService li = new ShowBitsService(64);

		System.out.println("123 in binary: ");
		b.show(123);

		System.out.println("\n87987 in binary: ");
		i.show(87987);

		System.out.println("\n237658768 in binary: ");
		li.show(237658768);
		
		//Você também pode exibir os bits de ordem inferior de qualquer inteiro 
		System.out.println("\nLow order 8 bits of 87987 in binary:  ");
		b.show(87987);
		
	}
}
