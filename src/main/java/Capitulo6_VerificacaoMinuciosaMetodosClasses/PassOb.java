package Capitulo6_VerificacaoMinuciosaMetodosClasses;

public class PassOb {
	public static void main(String[] args) {

		Block ob1 = new Block(10, 2, 5);
		Block ob2 = new Block(10, 2, 5);
		Block ob3 = new Block(4, 5, 5);

		System.out.println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2));
		System.out.println("ob2 same dimensions as ob1: " + ob2.sameBlock(ob1));
		System.out.println("ob1 same dimensions as ob3: " + ob1.sameBlock(ob3));
		System.out.println("ob2 same dimensions as ob3: " + ob2.sameBlock(ob3));

	}
}
