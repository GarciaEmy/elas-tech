package org.example.aula14;

public class Gerente extends Funcionario implements Notificavel, Exportavel {

    public void aprovarFerias(String quem) {
        System.out.println(getNome() + " aprovou as férias de " + quem);
    }
    @Override
    public void notificar(String mensagem) {
        System.out.println("Notificação para " + getNome() + ": " + mensagem);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando dados do gerente " + getNome() + "...");
    }
}