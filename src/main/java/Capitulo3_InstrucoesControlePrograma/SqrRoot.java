package Capitulo3_InstrucoesControlePrograma;

//Exibe as raízes quadradas de 1 99 e o erro de arredondamento
public class SqrRoot {
	public static void main(String[] args) {

		double num, sRoot, rErr;

		for (num = 1.0; num < 100.0; num++) {
			sRoot = Math.sqrt(num);
			System.out.println("Square root of " + num + " is " + sRoot);

			// calcula o erro de arredondamento
			rErr = num - (sRoot * sRoot);
			System.out.println("Rounding error is " + rErr);
			System.out.println();
		}
	}
}
