package com.essj.clinix.models;

import com.essj.clinix.models.enums.Role;

import java.util.Set;

public class Client extends User{


    public Client() {
    }

    public Client(Long id, String name, String username, String password, String cpf, String email, String phoneNumber, Set<Role> roles) {
        super(id, name, username, password, cpf, email, phoneNumber, roles);
    }

}
