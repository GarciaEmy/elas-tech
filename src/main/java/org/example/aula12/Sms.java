package org.example.aula12;

public class Sms  implements Notificacao{

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviar SMS: " + mensagem);
    }
}
