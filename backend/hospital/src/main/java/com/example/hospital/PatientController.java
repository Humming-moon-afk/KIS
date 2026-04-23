package com.example.hospital;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class PatientController {

    private List<Patient> patients = new ArrayList<>();

    @PostMapping("/patients")
    public Patient createPatient(@RequestBody Patient patient) {
        patients.add(patient);
        System.out.println("Neuer Patient empfangen: " + patient.getName());
        return patient; 
    }

    @GetMapping("/patients")
    public List<Patient> getAllPatients() {
        return patients;
    }
}