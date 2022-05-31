package entities;

import java.util.Date;

public class Processos {
    private int numero;
    private String finalidade;
    private String descricao;
    private Date dataEntrada;
    private Pessoa pessoa;
    private Setor_Universidade setor;

    public Processos(int numero, String finalidade, String descricao, Date dataEntrada, Pessoa pessoa) {
        this.numero = numero;
        this.finalidade = finalidade;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.pessoa = pessoa;
    }
    public Processos() {
    }

    public String getNomePessoa(){
        return pessoa.getNome();
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Setor_Universidade getSetor() {
        return setor;
    }

    public void setSetor(Setor_Universidade setor) {
        this.setor = setor;
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

    public String getDataEntrada() {
        return dataEntrada.toString();
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

}