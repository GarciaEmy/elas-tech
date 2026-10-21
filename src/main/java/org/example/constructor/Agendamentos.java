package org.example.constructor;

public class Agendamentos {
    private String nomePet;
    private String servico;
    private String horario;
    private boolean perfume;
    private boolean laco;
    private boolean hidratacao;
    private String observacao;
    private double desconto;

    // Construtor que recebe TODOS os atributos de uma vez só
    public Agendamentos(String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;

  // Método para imprimir tudo de forma organizada
        System.out.println("--- Agendamento: " + nomePet + " ---");
        System.out.println("Serviço: " + servico + " | Horário: " + horario);
        System.out.println("Perfume: " + perfume + " | Laço: " + laco + " | Hidratação: " + hidratacao);
        System.out.println("Observação: " + observacao);
        System.out.println("Desconto: " + (desconto * 100) + "%");
        System.out.println("------------------------------------\n");
    }

    public void mostrar() {
    }
}
