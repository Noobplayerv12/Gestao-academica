package entities;

import java.util.ArrayList;
import java.util.List;

public class Setor_Universidade {

    private int idsetor;
    private String nomesetor;
    private List<Processos> processos = new ArrayList<>();

    public void adcionarProcesso(Processos processo) {
        processos.add(processo);
    }

    public Setor_Universidade(int idsetor, String nomesetor) {
        this.idsetor = idsetor;
        this.nomesetor = nomesetor;
    }

    public int getIdSetor() {
        return idsetor;
    }

    public void setIdSetor(int idsetor) {
        this.idsetor = idsetor;
    }

    public String getNomeSetor() {
        return nomesetor;
    }

    public void setNomeSetor(String nomesetor) {
        this.nomesetor = nomesetor;
    }

    public List<Processos> getProcessos() {
        return processos;
    }

    public void returnProcessos(){
        for(Processos x : processos){
            System.out.print("/////////////////////////////////////\n"+
            "Número do processo: "+ x.getDescricao()+
            "\nFinalidade: "+ x.getFinalidade()+
            "\nData: "+ x.getDataEntrada()+
            "\nPessoa: \n");

            };
    }   
}
