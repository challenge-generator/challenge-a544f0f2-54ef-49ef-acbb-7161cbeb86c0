package com.pragma.protocol.application.controller;

import com.pragma.protocol.domain.model.Message;
import com.pragma.protocol.infrastructure.adapter.ProtocolAdapter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class ProtocolController {
    private final ProtocolAdapter protocolAdapter;

    public ProtocolController(ProtocolAdapter protocolAdapter) {
        this.protocolAdapter = protocolAdapter;
    }
    @GetMapping("/{id}")
    public Message getMessage(@PathVariable String id) {
        return protocolAdapter.getMessage(id);
    }
    @PostMapping
    public Message createMessage(@RequestBody Message message) {
        return protocolAdapter.createMessage(message);
    }
    @PutMapping("/{id}")
    public Message updateMessage(@PathVariable String id, @RequestBody Message message) {
        message.id(id);
        return protocolAdapter.updateMessage(message);
    }
    @DeleteMapping("/{id}")
    public void deleteMessage(@PathVariable String id) {
        protocolAdapter.deleteMessage(id);
    }
}