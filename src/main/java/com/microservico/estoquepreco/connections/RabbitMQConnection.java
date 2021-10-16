package com.microservico.estoquepreco.connections;

import org.springframework.amqp.core.Queue;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConnection {

    private Queue fila(String nomeFila){
        return new Queue(nomeFila, true, false, false);
    }


}
