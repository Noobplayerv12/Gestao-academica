package entities;

import java.util.ArrayList;

import java.util.Date;

public class Historico {

	private Date dataEncaminhamento;
	private Setor_Universidade setorDestino;
	private String parecer;
	private String situacaoProcesso;
	private ArrayList<Processo> processos;

	public Historico(Date dataEncaminhamento, Setor_Universidade setorDestino, String parecer,
			String situacaoProcesso) {
		super();
		this.dataEncaminhamento = dataEncaminhamento;
		this.setorDestino = setorDestino;
		this.parecer = parecer;
		this.situacaoProcesso = situacaoProcesso;
		this.processos = new ArrayList<Processo>();
	}

	public Date getDataEncaminhamento() {
		return dataEncaminhamento;
	}

	public void setDataEncaminhamento(Date dataEncaminhamento) {
		this.dataEncaminhamento = dataEncaminhamento;
	}

	public Setor_Universidade getsetorDestino() {
		return setorDestino;
	}

	public void setOrgaoDestino(Setor_Universidade setorDestino) {
		this.setorDestino = setorDestino;
	}

	public String getParecer() {
		return parecer;
	}

	public void setParecer(String parecer) {
		this.parecer = parecer;
	}

	public String getSituacaoProcesso() {
		return situacaoProcesso;
	}

	public void setSituacaoProcesso(String situacaoProcesso) {
		this.situacaoProcesso = situacaoProcesso;
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
