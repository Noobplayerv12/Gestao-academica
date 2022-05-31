package entities;
import java.util.ArrayList;

public class Funcionarios extends Pessoa{
	private String numeroRegistro;
	private String cargo;
	private Setor_Universidade setor;
	private ArrayList<Processos> processos;
	
	public Funcionarios(String nome, String cpf, String email, String telefone, String numeroRegistro, String cargo, Setor_Universidade setor) {
		super(nome, cpf, email, telefone);
		this.numeroRegistro = numeroRegistro;
		this.cargo = cargo;
		this.setor = setor;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public ArrayList<Processos> getProcessos() {
		return processos;
	}
	
	public void setSetor(Setor_Universidade setor) {
		this.setor = setor;
	}

	public Setor_Universidade getSetor() {
		return setor;
	}

	public void setProcessos(ArrayList<Processos> processos) {
		this.processos = processos;
	}

}
