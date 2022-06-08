package entities;
import java.util.ArrayList;

import java.util.Date;

public class Historico {
    
    private Date dataEncaminhamento;
    private Setor_Universidade orgaoDestino;
    private boolean parecer;
    private boolean situacaoProcesso;
    
    public Historico(Date dataEncaminhamento, Setor_Universidade orgaoDestino, boolean parecer, boolean situacaoProcesso) {
		super();
		this.dataEncaminhamento = dataEncaminhamento;
		this.orgaoDestino = orgaoDestino;
		this.parecer = parecer;
		this.situacaoProcesso = situacaoProcesso;
	}
	public Historico() {
		super();
	}
	public String getDataEncaminhamento() {
		return dataEncaminhamento.toString();
	}
	public void setDataEncaminhamento(Date dataEncaminhamento) {
		this.dataEncaminhamento = dataEncaminhamento;
	}
	public Setor_Universidade getOrgaoDestino() {
		return orgaoDestino;
	}
	public String getOrgaoDestinoNome() {
		return orgaoDestino.getNomeSetor().toString();
	}
	public void setOrgaoDestino(Setor_Universidade orgaoDestino) {
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
	public String getNomeProcesso(ArrayList<Processos> proc) {
		for (Processos processo : proc) {
				return processo.getNomePessoa();
		}
		return null;
	}
    
}
