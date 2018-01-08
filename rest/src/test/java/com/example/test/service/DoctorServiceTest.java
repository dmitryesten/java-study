package com.example.test.service;

import com.example.test.models.Doctor;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import static org.junit.Assert.*;


public class DoctorServiceTest {


    private Doctor docTest1 = new Doctor("01AD", "Иван", "Иванов", "Хирургическое отд.", "D05.1, ER55.0, G34.96");
    private Doctor docTest2 = new Doctor("F84T", "Петр", "Петров", "Хирургическое отд.", "D28.0, TR55.0, G35.0");
    private Doctor docTest3 = new Doctor("51CK", "Сергей", "Сергеев", "Нефровлогическое отд.", "EM45.0, U78.0");

    private Map<String, Doctor> expectedListDoctors = new ConcurrentHashMap<>();

    private DoctorService doctorService;


    @Before
    public void setUp() throws Exception {
        doctorService = new DoctorService(null);
        doctorService.addDoctor(docTest1);
        doctorService.addDoctor(docTest2);
        doctorService.addDoctor(docTest3);

        expectedListDoctors.put(docTest1.getPersonalNumber(), docTest1);
        expectedListDoctors.put(docTest2.getPersonalNumber(), docTest2);
        expectedListDoctors.put(docTest3.getPersonalNumber(), docTest3);
    }


    @Test
    public void addDoctor() throws Exception {
        Doctor expectedDoc = new Doctor("RS711", "Олег", "Олегов", "Нефровлогическое отд.", "J4L.0, Y61.0");
        doctorService.addDoctor(expectedDoc);

        assertEquals(expectedDoc, doctorService.getDoctorByPersonalNumber("RS711"));
    }

    @Test
    public void removeDoctor() throws Exception {
        assertEquals(docTest2, doctorService.getDoctorByPersonalNumber("F84T"));
        doctorService.removeDoctor("F84T");
        assertEquals(null, doctorService.getDoctorByPersonalNumber("F84T"));
    }

    @Test
    public void removeAllDoctors() throws Exception {
        doctorService.removeAllDoctors();
        assertTrue(doctorService.getListDoctors().isEmpty());
    }

    @Test
    public void getDoctorByPersonalNumber() throws Exception {
        assertEquals("51CK", doctorService.getDoctorByPersonalNumber("51CK").getPersonalNumber());
    }

    @Test
    public void getListDoctors() throws Exception {
        assertEquals(expectedListDoctors.values().toString(), doctorService.getListDoctors().toString());
    }

    @Test
    public void update() throws Exception {
        docTest3.setName("Евгений");
        doctorService.update(docTest3);
        assertEquals(docTest3, doctorService.getDoctorByPersonalNumber(docTest3.getPersonalNumber()));
    }

    @Test
    public void getDoctorsByIlls() throws Exception {
        Doctor expectedObj =  new Doctor("R456","Иван","Иванов", "Кардио-хирург. отд", "T67");

        List<Doctor> expected = new ArrayList<>();
        expected.add(expectedObj);

        doctorService.addDoctor(expectedObj);
        assertEquals(expected, doctorService.getDoctorsByIlls("T67"));

    }


}