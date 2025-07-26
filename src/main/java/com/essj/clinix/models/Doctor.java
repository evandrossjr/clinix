package com.essj.clinix.models;

import com.essj.clinix.models.enums.DayOfWeekBR;
import com.essj.clinix.models.enums.Role;
import com.essj.clinix.models.enums.Specialty;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

public class Doctor extends User{

    @NotNull
    private int crm;

    @NotBlank
    @Enumerated(EnumType.STRING)
    private Specialty specialty;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<DayOfWeekBR> workingDays;

    public Doctor() {
    }

    public Doctor(Long id, String name, String username, String password, String cpf, String email, String phoneNumber, Set<Role> roles, int crm, Specialty specialty, Set<DayOfWeekBR> workingDays) {
        super(id, name, username, password, cpf, email, phoneNumber, roles);
        this.crm = crm;
        this.specialty = specialty;
        this.workingDays = workingDays;
    }

    public Doctor(int crm, Specialty specialty, Set<DayOfWeekBR> workingDays) {
        this.crm = crm;
        this.specialty = specialty;
        this.workingDays = workingDays;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public Set<DayOfWeekBR> getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(Set<DayOfWeekBR> workingDays) {
        this.workingDays = workingDays;
    }

}
