package com.example.test.endpoint;


import com.example.test.models.Doctor;
import com.example.test.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@RestController
public class DoctorEndpoint {

    private final DoctorService doctorService;


    @Autowired
    public DoctorEndpoint(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @ResponseBody
    @GetMapping("/hello")
    public String getHello() {
        return "Hi";
    }


    @ResponseBody
    @GetMapping(value = "/doctors/{personal_number}",
                produces = MediaType.APPLICATION_JSON_VALUE)
    public Doctor getDoctor(@PathVariable("personal_number") String id){
        return doctorService.getDoctorByPersonalNumber(id);
    }


    @ResponseBody
    @GetMapping(value = "/all_doctors",
                produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Doctor> getAllDoctors(){
        return doctorService.getListDoctors();
    }


    @ResponseBody
    @PostMapping(value = "/add_doctor",
                 produces = MediaType.APPLICATION_JSON_VALUE,
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    public Doctor addDoctor(@Valid @RequestBody Doctor doctor) {
       doctorService.addDoctor(doctor);
       return doctor;
    }


    @ResponseBody
    @DeleteMapping(value = "/doctors/{personal_number}",
                   produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteDoctor(@PathVariable("personal_number") String id){
         doctorService.removeDoctor(id);
         return "Doctor is deleted";
    }


    @ResponseBody
    @DeleteMapping(value = "/deleted_all_doctors",
                   produces = MediaType.APPLICATION_JSON_VALUE)
    public String deleteAllDoctors(){
        doctorService.removeAllDoctors();
        return "All doctors are deleted";
    }

    @ResponseBody
    @PutMapping(value = "/update_doctor/{personal_number}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String update(@PathVariable("personal_number") String id){
        doctorService.update(doctorService.getDoctorByPersonalNumber(id));
        return "Doctor is updated";
    }


}
