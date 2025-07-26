package com.essj.clinix.mapper;

import com.essj.clinix.dtos.DoctorDTO;
import com.essj.clinix.models.Doctor;

public class DoctorMapper {
    public static DoctorDTO toDTO(Doctor doctor) {
        if (doctor == null) return null;

        return new DoctorDTO(
                doctor.getId(),
                doctor.getName(),
                doctor.getUsername(),
                doctor.getPassword(),
                doctor.getCpf(),
                doctor.getEmail(),
                doctor.getPhoneNumber(),
                doctor.getCrm(),
                doctor.getSpecialty(),
                doctor.getWorkingDays()
        );
    }

    public static Doctor toEntity(DoctorDTO dto) {
        if (dto == null) return null;

        Doctor doctor = new Doctor();
        doctor.setId(dto.id());
        doctor.setName(dto.nome());
        doctor.setUsername(dto.username());
        doctor.setPassword(dto.password());
        doctor.setCpf(dto.cpf());
        doctor.setEmail(dto.email());
        doctor.setPhoneNumber(dto.telefone());
        doctor.setCrm(dto.crm());
        doctor.setSpecialty(dto.specialty());
        doctor.setWorkingDays(dto.workingDays());

        return doctor;
    }
}
