package Capitulo6_VerificacaoMinuciosaMetodosClasses;

public class ErrInfo {
	public static void main(String[] args) {
		ErrorInfo err = new ErrorInfo();
		Err e;

		e = err.getErrorInfor(2);
		System.out.println(e.msg + " severity: " + e.severity);
		e = err.getErrorInfor(19);
		System.out.println(e.msg + " severity: " + e.severity);

	}
}
