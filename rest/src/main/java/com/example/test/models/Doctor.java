package com.example.test.models;

import com.example.test.interfaces.IDoctor;


public class Doctor implements IDoctor {

    public Doctor(){}

    public Doctor(String persID, String name, String surname, String department, String ills){
        this.persID = persID;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.ills = ills;
    }

    private String persID;
    private String name;
    private String surname;
    private String department;
    private String ills;


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
        return persID;
    }

    public void setPersonalNumber(String persID) {
        this.persID = persID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getListIlls() {
        return ills;
    }

    public void setListIlls(String listIlls) {
        StringBuilder currentListIlls = new StringBuilder(this.ills);
        StringBuilder newIlls = new StringBuilder(listIlls);

        currentListIlls.append(", " + newIlls);
        this.ills = currentListIlls.toString();

    }

}
