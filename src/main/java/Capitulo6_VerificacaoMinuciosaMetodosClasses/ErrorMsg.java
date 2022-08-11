package Capitulo6_VerificacaoMinuciosaMetodosClasses;

//Retorna um objeto String. 
public class ErrorMsg {

	String msgs[] = { "Output Error", "Input Error", "Disk Full", "Index Out-of-Bouns" };

	// Retorna a mensagem de erro.
	String gerErrorMsg(int i) {
		if (i >= 0 & i < msgs.length)
			return msgs[i];
		else
			return "Invalid Error Code";
	}
}
