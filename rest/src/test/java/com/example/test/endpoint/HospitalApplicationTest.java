package com.example.test.endpoint;


import com.example.test.HospitalApplication;
import com.example.test.models.Doctor;
import com.example.test.service.DoctorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.LinkedList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(HospitalApplication.class)
public class HospitalApplicationTest {

    private List<Doctor> testD = new LinkedList<>();
    public HospitalApplicationTest(){
        testD.add(new Doctor());
    }

    @MockBean
    private DoctorService service;

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;


    @Test
    public void test() throws Exception {
        this.mvc.perform(
                get("/hello")
                        .param("whatever", "123"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hi"));
    }


    @Test
    public void testAddDoctor()throws Exception{
        this.mvc.perform(
                post("/doctors")
                        .param(String.valueOf(new Doctor())))
                .andExpect(status().isOk())
                .andExpect(content().string("Doctor is added"));
    }

    @Test
    public void testDeleteDoctor()throws Exception{
        this.mvc.perform(
                delete("/doctors/{personal_number}")
                        .param("A1D102"))
                .andExpect(status().isOk())
                .andExpect(content().string("Doctor is deleted"));
    }

    @Test
    public void testRemoveAllDoctors() throws Exception{
        this.mvc.perform(
                delete("/doctors"))
                .andExpect(status().isOk())
                .andExpect(content().string("All doctors is removed"));
    }


    @Test
    public void testGetDoctor() throws Exception{
        this.mvc.perform(
                get("/doctors/{personal_number}")
                        .param("458V6"))
                .andExpect(status().isOk())
                .andExpect(content().string(String.valueOf(new Doctor())));

    }

    @Test
    public void testGetAllDoctor() throws Exception {
        this.mvc.perform(
                get("/doctors"))
                .andExpect(status().isOk())
                .andExpect(content().string(testD.toString()));
    }




}
