package com.example.test.service;

import com.example.test.models.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;



@Service
public class DoctorService {

    private static Map<String, Doctor> doctorList = new HashMap<>();

    private final Doctor doctor;

    static {
        initDocs();
    }

    private static void initDocs() {
        Doctor doctor1 = new Doctor("01AD", "Иван", "Иванов", "Хирургическое отд.", "1");
        Doctor doctor2 = new Doctor("F84T", "Петр", "Петрович", "Хирургическое отд.", "ER55.0, TR55.0, G35.0");
        Doctor doctor3 = new Doctor("51CK", "Сергей", "Сергеевич", "Нефровлогическое отд.", "EM45.0, U78.0");

        doctorList.put(doctor1.getPersonalNumber(), doctor1);
        doctorList.put(doctor2.getPersonalNumber(), doctor2);
        doctorList.put(doctor3.getPersonalNumber(), doctor3);
    }

    @Autowired
    public DoctorService(Doctor doctor) {
        this.doctor = doctor;
    }

    public void addDoctor(Doctor doctor) {
       doctorList.put(doctor.getPersonalNumber(), doctor);
    }

    public void removeDoctor(String personalNumber) {
        doctorList.remove(personalNumber);
    }

    public void removeAllDoctors(){
        doctorList.clear();
    }

    public Doctor getDoctorByPersonalNumber(String personalNumber){
        return doctorList.get(personalNumber);
    }

    public Collection<Doctor> getListDoctors(){
        return doctorList.values();
    }

    public void update(Doctor doctor){
        doctorList.replace(doctor.getPersonalNumber(), doctor);
    }


    public List<Doctor> getDoctorsByIlls(String ill) {
        List <Doctor> list = new ArrayList<>();
        for (Doctor doctor : doctorList.values()) {
            if(ill.equals(doctor.getListIlls()) )
                 list.add(doctor);
        }
        return list;
    }


}
