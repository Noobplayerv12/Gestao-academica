package entities;

import java.util.ArrayList;

public class Setor_Universidade {

    private int idSetor;
    private String nomeSetor;
    private ArrayList<Processo> processos;

    public Setor_Universidade(int idSetor, String nomeSetor) {
        this.idSetor = idSetor;
        this.nomeSetor = nomeSetor;
        this.processos = new ArrayList<Processo>();
    }

    public Setor_Universidade() {
        this.processos = new ArrayList<Processo>();
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idsetor) {
        this.idSetor = idsetor;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomesetor) {
        this.nomeSetor = nomesetor;
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

    public void encaminharProcesso(Processo processo, Setor_Universidade setor) {
        setor.removerProcesso(processo);
        setor.addProcesso(processo);
    }

    // #endregion

}
