package com.pragma.protocol.application.service;

import com.pragma.protocol.domain.model.Message;
import org.springframework.stereotype.Service;

@Service
public class ProtocolService {
    public Message getMessage(String id) {
        // Implementación de la lógica de negocio
        return new Message(id, "Contenido del mensaje");
    }
    public Message createMessage(Message message) {
        // Implementación de la lógica de negocio
        return message;
    }
    public Message updateMessage(Message message) {
        // Implementación de la lógica de negocio
        return message;
    }
    public void deleteMessage(String id) {
        // Implementación de la lógica de negocio
    }
}