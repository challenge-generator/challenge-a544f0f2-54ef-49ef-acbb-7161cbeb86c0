package com.pragma.protocol.application.service;

import com.pragma.protocol.domain.model.Message;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProtocolServiceTest {
    @Autowired
    private ProtocolService protocolService;
    @Test
    void testGetMessage() {
        Message message = protocolService.getMessage("1");
        assertNotNull(message);
        assertEquals("1", message.id());
    }
    @Test
    void testCreateMessage() {
        Message message = new Message("2", "Nuevo mensaje");
        Message createdMessage = protocolService.createMessage(message);
        assertNotNull(createdMessage);
        assertEquals("2", createdMessage.id());
    }
    @Test
    void testUpdateMessage() {
        Message message = new Message("1", "Mensaje actualizado");
        Message updatedMessage = protocolService.updateMessage(message);
        assertNotNull(updatedMessage);
        assertEquals("1", updatedMessage.id());
    }
    @Test
    void testDeleteMessage() {
        protocolService.deleteMessage("1");
    }
}