package entities;

import java.util.ArrayList;

public class Alunos extends Pessoa {

	private String matricula;
	private String curso;
	private ArrayList<Processo> processos;

	public Alunos(String nome, String cpf, String email, String telefone, String matricula, String curso) {
		super(nome, cpf, email, telefone);
		this.matricula = matricula;
		this.curso = curso;
		this.processos = new ArrayList<Processo>();

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

	// #region Metodos para interagir com o arraylist

	public void addProcesso(Processo processo) {
		processos.add(processo);
	}

	public int qntdProcesso() {
		return processos.size();
	}

	public void removerProcesso(Processo processo) {
		processos.remove(processo);

	}

	public Processo getProcesso(int posicao) {
		return processos.get(posicao);

	}

	// #endregion

}
