package com.pragma.protocol.infrastructure.adapter;

import com.pragma.protocol.application.service.ProtocolService;
import com.pragma.protocol.domain.model.Message;
import org.springframework.stereotype.Component;

@Component
public class ProtocolAdapter {
    private final ProtocolService protocolService;

    public ProtocolAdapter(ProtocolService protocolService) {
        this.protocolService = protocolService;
    }
    public Message getMessage(String id) {
        return protocolService.getMessage(id);
    }
    public Message createMessage(Message message) {
        return protocolService.createMessage(message);
    }
    public Message updateMessage(Message message) {
        return protocolService.updateMessage(message);
    }
    public void deleteMessage(String id) {
        protocolService.deleteMessage(id);
    }
}