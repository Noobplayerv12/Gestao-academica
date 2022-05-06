package entities;


public class Setor_Universidade {

    private int idsetor;
    private String nomesetor;

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
   
}
