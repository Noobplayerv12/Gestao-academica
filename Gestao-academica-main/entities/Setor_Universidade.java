package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
    // #endregion

    public void encaminharProcesso(Processo processo, Setor_Universidade setorOrigem, Setor_Universidade setorDestino) {
        // Remove o processo so setor de origem para ser encaminhado para outro setor
        if (setorOrigem.qntdProcesso() >= 1) {
            setorOrigem.removerProcesso(processo);
        }
        // Adiciona o processo no setor destino
        setorDestino.addProcesso(processo);

        var dataEncaminhamento = new Date();
        DataUtil.converterDate(dataEncaminhamento);

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual parecer no processo");
        String parecer = sc.nextLine();
        System.out.println("Informe se ainda continua em análise ou se já foi concluído");
        String situacaoProcesso = sc.nextLine();
        sc.close();

        Historico historico = new Historico(dataEncaminhamento, setorDestino, parecer, situacaoProcesso);

        historico.addProcesso(processo);

        // Imprimir historico conforme pedido nos requisitos
        // deve ficar registrado no sistema indicando a data do encaminhamento,
        // o órgão de destino, o parecer e a situação do processo (se ainda continua em
        // análise ou se já foi concluído).
        for (int i = 0; i < historico.qntdProcesso(); i++) {
            System.out.println("\n******HISTORICO*********");
            System.out.println(
                    "Data do encaminhament o" + DataUtil.converterDate(historico.getDataEncaminhamento()) + "\n" +
                            "Encaminhado para o setor: " + setorDestino.getNomeSetor() + "\n"
                            + "Parecer: " + historico.getParecer() + "\n"
                            + "Situacao: " + historico.getSituacaoProcesso());
            System.out.println("*************************");
        }
    }

}
