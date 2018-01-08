package com.example.test.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoctorTest {

    @Test
    public void setListIlls() throws Exception {
        Doctor doctor = new Doctor("as", "asd", "asd", "asd", "ER");
        assertEquals("ER", doctor.getListIlls());
        doctor.setListIlls("QW");
        assertEquals("ER, QW", doctor.getListIlls());
    }

}