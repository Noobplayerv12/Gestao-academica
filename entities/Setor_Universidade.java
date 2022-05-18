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

    public int getIdsetor() {
        return idsetor;
    }

    public void setIdsetor(int idsetor) {
        this.idsetor = idsetor;
    }

    public String informaNomesetor() {
        return nomesetor;
    }

    public void setNomesetor(String nomesetor) {
        this.nomesetor = nomesetor;
    }

    public List<Processos> getProcessos() {
        return (
            for(Processos x : processos)
        );
    }

}
