package entities;

import java.util.ArrayList;
import java.util.List;

public class Setor_Universidade {

    private int idSetor;
    private String nomeSetor;
    private List<Processos> processos = new ArrayList<>();

    public void adcionarProcesso(Processos processo) {
        processos.add(processo);
    }

    public Setor_Universidade(int idSetor, String nomeSetor) {
        this.idSetor = idSetor;
        this.nomeSetor = nomeSetor;
    }

    public int getIdsetor() {
        return idSetor;
    }

    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }

    public List<Processos> getProcessos() {
        return processos;
    }

    public void returnProcessos(){
        for(Processos x : processos){
            System.out.println(x);
        };
    }

}
