package semana13;

public class DiaDaSemana {
	
	public String getDia3(int dia) {
		String[] ret = {"domingo","segunda","terça","quarta","quinta","sexta","sábado","inválido"};
		return ret[dia-1];
	}
	
	public String getDia2(int dia) {
		String ret = "";
		switch(dia) {
		case 1: ret = "domingo"; break;
		case 2: ret = "segunda"; break;
		case 3: ret = "terça"; break;
		case 4: ret = "quarta"; break;
		default: ret = "inválido"; break;
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
			return "inválido";
		}
	}
}
