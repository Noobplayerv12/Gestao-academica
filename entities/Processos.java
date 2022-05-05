package entities;

public class Processos {
	
	public int numProcesso;
	public String finalidade;
	public String descricao;
	public String dtEntrada;
	public String setorDestino;

	public Processos (int numProcesso,String finalidade,String descricao,String dtEntrada,String setorDestino) {
		super();
		this.numProcesso = numProcesso;
		this.finalidade = finalidade;
		this.descricao = descricao;
		this.setorDestino = dtEntrada;
		this.setorDestino = setorDestino;
	
}
	public int getnumProcesso() {
		return numProcesso;
	}

	public void setnumProcesso(int numProcesso) {
		this.numProcesso = numProcesso;
	}

	public String getfinalidade() {
		return finalidade;
	}

	public void setfinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

	public String getdescricao() {
		return descricao;
	}

	public void setdescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getdtEntrada() {
		return setorDestino;
	}

	public void setdtEntrada(String dtEntrada) {
		this.setorDestino = dtEntrada;
	}
	
	public String getdtsetorDestino() {
		return setorDestino;
	}

	public void setsetorDestino(String setorDestino) {
		this.setorDestino = setorDestino;
	}
	
}


