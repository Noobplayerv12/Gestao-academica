package entities;

import java.util.ArrayList;
import java.util.List;

public class Setor_Universidade {

    private int idSetor;
    private String nomeSetor;
    private ArrayList<Processos> processos = new ArrayList<>();

    public void adcionarProcesso(Processos processo) {
        processos.add(processo);
    }

    public Setor_Universidade(int idSetor, String nomeSetor) {
        this.idSetor = idSetor;
        this.nomeSetor = nomeSetor;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idsetor) {
        this.idSetor = idsetor;
    }

    public String getNomeSetor() {
        return nomeSetor.toString();
    }

    public void setNomeSetor(String nomesetor) {
        this.nomeSetor = nomesetor;
    }

    public List<Processos> getProcessos() {
        return processos;
    }

    public Processos getProcesso(int i){
        return processos.get(i);
    }

    public void setProcessos(Processos processos) {
        this.processos.add(processos);
    }

    public void returnProcessos(){
        for(Processos x : processos){
            System.out.print("/////////////////////////////////////\n"+
            "Número do processo: "+ x.getDescricao()+
            "\nFinalidade: "+ x.getFinalidade()+
            "\nData: "+ x.getDataEntrada()+"\n");

            };
    }

}
