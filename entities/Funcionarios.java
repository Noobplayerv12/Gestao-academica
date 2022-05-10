package entities;
import java.util.ArrayList;

public class Funcionarios extends Pessoa{
	private Integer numeroRegistro;
	private String cargo;
	private ArrayList<Processos> processos;
	
	public Funcionarios(String nome, String cpf, String email, String telefone, Integer numeroRegistro, String cargo) {
		super(nome, cpf, email, telefone);
		this.numeroRegistro = numeroRegistro;
		this.cargo = cargo;
	}

	public Integer getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(Integer numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}
