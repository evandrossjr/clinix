package com.essj.clinix.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClientDTO(Long id,
                        @NotBlank String nome,
                        String username,
                        String password,
                        @NotNull String cpf,
                        @Email String email,
                        @NotNull String telefone) {
}
