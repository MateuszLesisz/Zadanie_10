package com.infoshareacademy.controller;

import com.infoshareacademy.dto.ClientDto;
import com.infoshareacademy.model.Client;
import com.infoshareacademy.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @PostMapping("client/new")
    public ResponseEntity<Client> addClient(@RequestBody ClientDto clientDto) {

        return ResponseEntity.accepted().body(clientService.createClient(new ClientDto(clientDto.getName())));
    }
}
