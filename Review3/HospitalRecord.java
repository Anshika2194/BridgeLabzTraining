package com.hospital.doctor;

import java.util.ArrayList;
import java.util.LinkedList;

public class HospitalRecord {
    private ArrayList<Patient> regularPatients;
    private LinkedList<Patient> emergencyCases;
    public HospitalRecord() {
        this.regularPatients = new ArrayList<>();
        this.emergencyCases = new LinkedList<>();
    }

    public void addPatient(Patient p) {
        regularPatients.add(p);

    }

    public void addEmergencyCase(Patient patient) {
        emergencyCases.add(patient);
    }
    public Patient searchPatient(int id) {
        for (Patient p : emergencyCases) {
            if (p.getPatientId() == id) {
                return p;
            }
        }
        for (Patient p : regularPatients) {
            if (p.getPatientId() == id) {
                return p;
            }
        }
        return null;
    }

    public void displayEmergencyCases() {
        for (Patient p : emergencyCases) {
            System.out.println(p);
        }
    }


    public void displayAllRecords() {
            for (Patient p : emergencyCases) {
                System.out.println(p);
            }
            for (Patient p : regularPatients) {
                System.out.println(p);
            }
    }


    public static void main(String[] args) {
        HospitalRecord hospital = new HospitalRecord();
        Patient p=new Patient(1,"Anshika",12);
        hospital.addPatient(p);
        hospital.addEmergencyCase(p);
    }
}

