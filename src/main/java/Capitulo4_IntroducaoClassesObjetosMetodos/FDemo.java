package Capitulo4_IntroducaoClassesObjetosMetodos;

public class FDemo {
	 
	int x;
	
	public FDemo(int i) {
		x = i;
	}
	
	//chamada quando o objeto é reciclado 
	protected void finalize() {
		System.out.println("Finalizing " + x);
		
	}
	
	void generator(int i) {
		FDemo o = new FDemo(i); 
	}
}
