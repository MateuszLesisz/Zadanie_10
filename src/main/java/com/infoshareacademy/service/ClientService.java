package com.infoshareacademy.service;

import com.infoshareacademy.model.Client;
import com.infoshareacademy.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public void createClient(Client client) {

        Client clientCreator = Client.builder()
                .name(client.getName())
                .build();
        clientRepository.save(clientCreator);
    }
}