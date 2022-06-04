package semana13;

public class DiaDaSemana {
	
	public String getDia3(int dia) {
		String[] ret = {"domingo","segunda","ter�a","quarta","quinta","sexta","s�bado","inv�lido"};
		return ret[dia-1];
	}
	
	public String getDia2(int dia) {
		String ret = "";
		switch(dia) {
		case 1: ret = "domingo"; break;
		case 2: ret = "segunda"; break;
		case 3: ret = "ter�a"; break;
		case 4: ret = "quarta"; break;
		default: ret = "inv�lido"; break;
		}
		return ret;
	}
	
	
	public String getDia(int dia) {
		if(dia == 1) {
			return "domingo";
		}
		else if(dia == 2) {
			return "segunda";
		}
		else {
			return "inv�lido";
		}
	}
}
