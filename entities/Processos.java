package entities;

import java.util.Date;

public class Processos {
    private int numero;
    private String finalidade;
    private String descricao;
    private Date dataEntrada;
    private Alunos aluno;
    private Funcionarios funcionario;
    private Setor_Universidade setor;

    public Processos(int numero, String finalidade, String descricao, Date dataEntrada, Alunos aluno,
            Funcionarios funcionario, Setor_Universidade setor) {
        this.numero = numero;
        this.finalidade = finalidade;
        this.descricao = descricao;
        this.dataEntrada = dataEntrada;
        this.aluno = aluno;
        this.funcionario = funcionario;
        this.setor = setor;
    }

    public Processos() {

    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
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

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

}