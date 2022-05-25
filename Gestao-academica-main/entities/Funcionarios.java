package entities;

import java.util.ArrayList;

public class Funcionarios extends Pessoa {
	private String numeroRegistro;
	private String cargo;
	private ArrayList<Processo> processos;

	public Funcionarios(String nome, String cpf, String email, String telefone, String numeroRegistro, String cargo) {
		super(nome, cpf, email, telefone);
		this.numeroRegistro = numeroRegistro;
		this.cargo = cargo;
		this.processos = new ArrayList<Processo>();
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

}
