package semana10;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import semana09.BD;

public class Funcionario {

	private int numero;
	private String nome;
	private float salario;
	private Cargo cargo;	//implementação da associação
	

	public Funcionario(int numero, String nome, float salario, Cargo cargo) {
		this.numero = numero;
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	
	public void mostrar() {
		System.out.println(numero);
		System.out.println(nome);
		System.out.println(salario);
		if(cargo!=null)
		System.out.println(cargo.getNome());
		System.out.println();
	}
	
	
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}


	public static List<Funcionario> getList() {
		
		List<Funcionario> lista = new ArrayList<Funcionario>();
		BD bd = new BD();
		bd.getConnection();
		//String sql = "select * from funcionarios";
		String sql = "select f.codigo, f.nome, f.salario, d.nome from funcionarios as f, departamentos as d where d.codigo = f.departamento";

		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			bd.rs.next(); //estou na primeira linha
				
			while(bd.rs.next()) {
				Funcionario f = new Funcionario(
							bd.rs.getInt("codigo"),
							bd.rs.getString("nome"),
							bd.rs.getFloat("salario")
							,null);
				lista.add(f);
			}
			
		} catch (SQLException e) {
			System.out.println(e);
			lista = null;
		} finally {
			bd.close();
		}
		return lista;
	}
}
