package com.essj.clinix.models;


import com.essj.clinix.models.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;

import java.util.HashSet;
import java.util.Set;


@MappedSuperclass
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String username;
    private String password;
    private String cpf;
    private String email;

    @Pattern(regexp = "\\(?\\d{2}\\)?\\s?\\d{8,9}", message = "Telefone inválido")
    private String phoneNumber;

    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles = new HashSet<>();

    public User() {
    }

    public User(Long id, String name, String username, String password, String cpf, String email, String phoneNumber, Set<Role> roles) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.cpf = cpf;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
