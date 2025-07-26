package com.essj.clinix.controller.api;


import com.essj.clinix.service.DoctorService;
import com.essj.clinix.dtos.DoctorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;


    @GetMapping
    public ResponseEntity<List<DoctorDTO>> findAll(){
        List<DoctorDTO> doctors = doctorService.findAll();
        return ResponseEntity.ok().body(doctors);
    }
}
