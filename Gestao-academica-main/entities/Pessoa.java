package entities;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private ArrayList<Processo> processos;

	public Pessoa(String nome, String cpf, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.processos = new ArrayList<Processo>();
	}

	public Pessoa() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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
