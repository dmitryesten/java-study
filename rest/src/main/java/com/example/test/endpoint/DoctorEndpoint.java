package com.example.test.endpoint;


import com.example.test.models.Doctor;
import com.example.test.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;


@RestController
public class DoctorEndpoint {

    private final DoctorService doctorService;

    @Autowired
    public DoctorEndpoint(DoctorService doctorService) {
        this.doctorService = doctorService;
    }


    @GetMapping("/hello")
    public String getHello() {
        return "Hi";
    }


    @PostMapping(value = "/doctors",
                 produces = MediaType.APPLICATION_JSON_VALUE,
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addDoctor(@Valid @RequestBody Doctor doctor) {
       doctorService.addDoctor(doctor);
       return "Doctor is added";
    }


    @DeleteMapping(value = "/doctors/{personal_number}")
    public String deleteDoctor(@Valid @RequestBody String doc_id){
        doctorService.removeDoctor(doc_id);
        return "Doctor is removed";
    }

    @DeleteMapping(value = "/doctors")
    public String deleteAllDoctors(){
        doctorService.removeAllDoctors();
        return "All doctors is removed";
    }


    @GetMapping(value = "/doctors/{personal_number}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Doctor getDoctor(@Valid @RequestBody String doc_id){
        return doctorService.getDoctorByPersonalNumber(doc_id);
    }


    @GetMapping(value = "/doctors")
    public List<Doctor> getAllDoctors(){
       return doctorService.getListDoctors();
    }







}
