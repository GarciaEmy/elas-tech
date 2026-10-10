package org.example.aula12;

import java.util.ArrayList;
import java.util.List;

public class Mensagem {

    static void main(String[] args) {
        List<Notificacao> notificacoes = new ArrayList<>();

        notificacoes.add(new Email());
        notificacoes.add(new Sms());

        String mensagem = "Seu código de verificação é: 4865";

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar(mensagem);
        }
    }
}
