package com.example.test.models;

import java.util.List;

public class Doctor {

    private String name;
    private String surname;
    private String personalNumber;
    private String department;
    private List<String> listIlls;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String privateNumber) {
        this.personalNumber = privateNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getListIlls() {
        return listIlls;
    }



    public void setListIlls(List<String> listIlls) {
        this.listIlls = listIlls;
    }



}
