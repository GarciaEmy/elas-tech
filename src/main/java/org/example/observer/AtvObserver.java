package org.example.observer;

import javax.security.auth.Subject;

public class AtvObserver {

    // 1 - Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele
    //
    // Resolve quando um padrão precisa notificar outros objetos sobre mudanças. Sem ele, precisaria visualizar todas as classes diretamente que dependem dele.
    //
    // exemplo: Do youtube, quando um criador posta um vídeo todos os inscritos receber uma notificação automática no celular.
    // O criador não precisar avisar cada um individualmente, ele apenas avisa a platforma de vídeo novo e a plataforma notifica quem está na lista de inscritos.
    //
    //
    //2 - No Observer, o que é o Subject o que é o Observer? Como o Subject avisa os observadores sem conhecer as classes concretas deles?
    //Subject: Responsável por gerenciar, e notificar sempre que o seu estado mudar.
    //Observer: É a interface, que define o método de atualização. qualquer objeto que queira receber notificações do subject deve implementar essa interface
    //
    //3 - Se você precisar adicionar um novo interessado, por exemplo um Entregador que também precisa saber quando o pedido muda de status
    // o que é preciso alterar na classe Pedido? Por quê?
    //
    //Não precisa alterar, a classe pedido interage apenas com a interface. qualquer nova classe que implemente essa interface pode ser integrada ao sistema
    //
    //
    //
    //
    //
    // .


}
