package com.essj.clinix;

import com.essj.clinix.models.Doctor;
import com.essj.clinix.models.enums.DayOfWeekBR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findWorkingDaysContaining(DayOfWeekBR day);

    @Query("SELECT DISTINCT d.specialty FROM Doctor d")
    List<String> findSpecialty();

    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByCpf(String cpf);
    boolean existsByCrm(int crm);

}
