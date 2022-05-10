package entities;
import java.util.Date;
public class Processos{
    private int numero;
    private String finalidade;
    private String descricao;
    private Date dataEntrada;
    private ArrayList<Setor_Universidade> Setor_Universidade;

        public Processos(int numero, String finalidade, String descricao, Date dataEntrada) {
        this.numero = numero;
        this.finalidade = finalidade;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
    }

 public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
    




}