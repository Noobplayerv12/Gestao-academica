package entities;
import java.util.ArrayList;

public class Alunos extends Pessoa{
 
	private String matricula;
	private String curso;
	private ArrayList<Processos> processos;
	public Alunos(String nome, String cpf, String email, String telefone, String matricula, String curso) {
		super(nome, cpf, email, telefone);
		this.matricula = matricula;
		this.curso = curso;
	}
	public Alunos() {
    }
    public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public ArrayList<Processos> getProcessos() {
		return processos;
	}
	
}
