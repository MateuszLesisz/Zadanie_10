package com.infoshareacademy.service;

import com.infoshareacademy.dto.ClientDto;
import com.infoshareacademy.model.Client;
import com.infoshareacademy.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

    public Client createClient(ClientDto clientDto) {

        Client clientCreator = Client.builder()
                .name(clientDto.getName())
                .build();
        return clientRepository.save(clientCreator);
    }
}