package Capitulo6_VerificacaoMinuciosaMetodosClasses;

public class ErrorInfo {

	String msgs[] = { "Output Error", "Input Error", "Disk Full", "Index Out-of-Bounds" };

	int howbad[] = { 3, 3, 2, 4 };

	Err getErrorInfor(int i) {
		if (i >= 0 & i < msgs.length)
			return new Err(msgs[i], howbad[0]);
		else
			return new Err("Invalid Error Code", 0);
	}

}
