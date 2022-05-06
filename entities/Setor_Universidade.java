package entities;


public class Setor_Universidade {

    private int idsetor;
    private String nomesetor;

    public Setor_Universidade(int id, String nomesetor) {
        this.idsetor = idsetor;
        this.nomesetor = nomesetor;                                                
    }

    public int getId() {
        return idsetor;
    }

    public void setId(int idsetor) {
        this.idsetor = idsetor;
    }

    public String informaNomesetor() {
        return nomesetor;
    }

    public void setNomesetor(String nomesetor) {
        this.nomesetor = nomesetor;
    }
   
}
