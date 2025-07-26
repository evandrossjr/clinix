package com.essj.clinix.dtos;

import com.essj.clinix.models.Doctor;
import com.essj.clinix.models.enums.DayOfWeekBR;
import com.essj.clinix.models.enums.Specialty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public record DoctorDTO(Long id,
                        @NotBlank String nome,
                        String username,
                        String password,
                        @NotNull String cpf,
                        @Email String email,
                        @NotNull String telefone,
                        @NotNull int crm,
                        Specialty specialty,
                        Set<DayOfWeekBR> workingDays) {

}
