package com.example.test.endpoint;


import com.example.test.models.Doctor;
import com.example.test.service.DoctorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(DoctorEndpoint.class)
public class DoctorEndpointTest {

    private List<Doctor> testD = new LinkedList<>();
    public DoctorEndpointTest(){
        testD.add(new Doctor());
    }

    @MockBean
    private DoctorService service;

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper mapper;


    @Test
    public void testHello() throws Exception {
        this.mvc.perform(
                get("/hello")
                        .param("whatever", "123"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hi"));
    }


    @Test
    public void testGetDoctor() throws Exception {
        String testID = "01AD";
        this.mvc.perform(
                get("/doctors/{personal_number}", testID).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


    @Test
    public void testGetAllDoctor() throws Exception {
        this.mvc.perform(
                get("/all_doctors"))
                .andExpect(status().isOk());
    }


    @Ignore
    public void addDoctor() throws Exception{
        this.mvc.perform(
                post("/add_doctor", new Doctor()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }


    @Test
    public void testDeleteDoctor() throws Exception {
        String testID = "01AD";
        this.mvc.perform(
                delete("/doctors/{personal_number}", testID).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


    @Test
    public void testDeleteAllDoctors() throws Exception {
        this.mvc.perform(
                delete("/deleted_all_doctors"))
                .andExpect(status().isOk())
                .andExpect(content().string("All doctors are deleted"));
    }

    @Test
    public void testUpdateDoctor() throws Exception {
        String testID = "01AD";
        this.mvc.perform(
                put("/update_doctor/{personal_number}", testID))
                .andExpect(status().isOk())
                .andExpect(content().string("Doctor is updated") );
    }


}
