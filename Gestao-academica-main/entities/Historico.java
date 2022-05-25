package entities;

import java.util.ArrayList;

import java.util.Date;

public class Historico {

	private Date dataEncaminhamento;
	private String orgaoDestino;
	private boolean parecer;
	private boolean situacaoProcesso;
	private ArrayList<Processo> processos;

	public Historico(Date dataEncaminhamento, String orgaoDestino, boolean parecer, boolean situacaoProcesso) {
		super();
		this.dataEncaminhamento = dataEncaminhamento;
		this.orgaoDestino = orgaoDestino;
		this.parecer = parecer;
		this.situacaoProcesso = situacaoProcesso;
	}

	public Date getDataEncaminhamento() {
		return dataEncaminhamento;
	}

	public void setDataEncaminhamento(Date dataEncaminhamento) {
		this.dataEncaminhamento = dataEncaminhamento;
	}

	public String getOrgaoDestino() {
		return orgaoDestino;
	}

	public void setOrgaoDestino(String orgaoDestino) {
		this.orgaoDestino = orgaoDestino;
	}

	public boolean isParecer() {
		return parecer;
	}

	public void setParecer(boolean parecer) {
		this.parecer = parecer;
	}

	public boolean isSituacaoProcesso() {
		return situacaoProcesso;
	}

	public void setSituacaoProcesso(boolean situacaoProcesso) {
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
