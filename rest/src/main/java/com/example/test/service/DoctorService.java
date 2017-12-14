package com.example.test.service;

import com.example.test.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Service
public class DoctorService {

    private static List<Doctor> doctorList = new LinkedList<>();

    private final Doctor doctor;


    @Autowired
    public DoctorService(Doctor doctor) {
        this.doctor = doctor;
    }


    public void addDoctor(Doctor doctor) {
       doctorList.add(doctor);
    }


    public void removeDoctor(String personalNumber) {
        int indexD = 0;
        for (Doctor s : doctorList) {
            if (s.getPersonalNumber().equals(personalNumber)) {
                indexD = doctorList.indexOf(s);
            }
        }
        doctorList.remove(doctorList.get(indexD));
    }


    public void removeAllDoctors(){
        doctorList.clear();
    }

    public Doctor getDoctorByPersonalNumber(String personalNumber){
        int indexD = 0;
        for (Doctor s : doctorList) {
            if (s.getPersonalNumber().equals(personalNumber)) {
                indexD = doctorList.indexOf(s);
            }
        }
        return doctorList.get(indexD);
    }

    public List<Doctor> getListDoctors(){
        return doctorList;
    }






}
