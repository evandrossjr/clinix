package com.essj.clinix.mapper;

import com.essj.clinix.dtos.ClientDTO;
import com.essj.clinix.models.Client;

public class ClientMapper {

    public static ClientDTO toDTO(Client client) {
        if (client == null) return null;

        return new ClientDTO(
                client.getId(),
                client.getName(),
                client.getUsername(),
                client.getPassword(),
                client.getCpf(),
                client.getEmail(),
                client.getPhoneNumber()
                );
    }

    public static Client toEntity(ClientDTO dto){
        if (dto == null) return null;

        Client client = new Client();
        client.setId(dto.id());
        client.setName(dto.nome());
        client.setUsername(dto.username());
        client.setPassword(dto.password());
        client.setCpf(dto.cpf());
        client.setEmail(dto.email());
        client.setPhoneNumber(dto.telefone());


        return client;
    }
}
