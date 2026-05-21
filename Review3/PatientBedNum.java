package com.hospital.doctor;

import java.util.LinkedList;

public class PatientBedNum {
    private LinkedList<Patient> alloList;
    public PatientBedNum() {
       this.alloList = new LinkedList<>();
    }

    public void admitPatient(int id, String name, int bedNum) {
        Patient newPatient = new Patient(id, name, bedNum);
        alloList.add(newPatient);

    }
    public boolean dischargePatient(int patientId) {

        for (int i = 0; i < alloList.size(); i++) {
            Patient p = alloList.get(i);
            if (p.getPatientId() == patientId) {
                alloList.remove(i);
                return true;
            }
        }
        return false;
    }
        public Patient searchPatient(int patientId) {
        for (Patient p : alloList) {
            if (p.getPatientId() == patientId) {
                return p;
            }
        }
        return null;
    }
        public void displayBedAllocation() {
        for (Patient p : alloList) {
            System.out.println(p);
        }

    }
        public static void main(String[] args) {
            PatientBedNum hospital = new PatientBedNum();
            hospital.admitPatient(1, "Anshika", 12);
            hospital.admitPatient(2, "Anshika2", 15);


        }
}



