package Capitulo6_VerificacaoMinuciosaMetodosClasses;

public class PassObRef {
	public static void main(String[] args) {

		Test ob = new Test(15, 20);

		System.out.println("ob.a and ob.b before all: " + ob.a + " " + ob.b);

		ob.change(ob);

		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);

	}
}
