package com.essj.clinix.service;


import com.essj.clinix.repositories.DoctorRepository;
import com.essj.clinix.dtos.DoctorDTO;
import com.essj.clinix.mapper.DoctorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    //Colocar o Password Encoder depois

    public List<DoctorDTO> findAll(){
        return doctorRepository.findAll().stream().map(DoctorMapper::toDTO).toList();
    }

}
