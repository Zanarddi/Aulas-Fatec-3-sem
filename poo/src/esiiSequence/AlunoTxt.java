package esiiSequence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AlunoTxt {
	

	/**
	 * Abre um arquivo texto contendo um aluno
	 * @param ra: o numero do arquivo a ser aberto
	 * @return: um objeto do tipo aluno contendo os dados do arquivo.
	 */
	public Aluno ler(String ra){
		Aluno aluno = new Aluno();
		try{
			BufferedReader br = new BufferedReader(new FileReader(ra+".txt"));
			aluno.setRa(br.readLine());
			aluno.setNome(br.readLine());
			aluno.setCurso(br.readLine());
			br.close();
			return aluno;
		}
		catch(IOException erro){
			return null;
		}
	}
	
	/**
	 * Grava em arquivo texto os dados de um aluno.
	 * @return: um texto informando o sucesso ou não da gravação
	 */
	public String gravar(Aluno aluno){
		try{
			PrintWriter pw = new PrintWriter(aluno.getRa()+".txt");
			pw.println(aluno.getRa()); 
			pw.println(aluno.getNome());
			pw.println(aluno.getCurso());
			pw.flush(); 
			pw.close(); 
			return "Arquivo gravado com sucesso!";
		}
		catch(IOException erro){
			return "Falha ao gravar o arquivo: "+erro.toString();
		}
	}
}
