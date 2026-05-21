package com.hospital.doctor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

//had problem in sort function as Collections.sort(doctorList) was giving error
public class DoctorManagement {
    private ArrayList<Doctor> doctorList;
    public DoctorManagement() {
        this.doctorList = new ArrayList<>();
    }
    public void addDoctor(Doctor doc) {
        doctorList.add(doc);
    }
    public void removeDoctor(int doctorId) {
        for (int i = 0; i < doctorList.size(); i++) {
            if (doctorList.get(i).getDoctorId() == doctorId) {
                doctorList.remove(i);
            }
        }
    }
    public Doctor searchDoctor(int doctorId) {
        for (Doctor doc : doctorList) {
            if (doc.getDoctorId() == doctorId) {
                return doc;
            }
        }
        return null;
    }

    public void sortDoctorsByExperience() {
       Collections.sort(doctorList, new Comparator<Doctor>() {
            @Override
            public int compare(Doctor d1, Doctor d2) {
                return Integer.compare(d2.getExperience(), d1.getExperience());
            }
        });


    }
    public void displayDoctors() {
        for (Doctor doc : doctorList) {
            System.out.println(doc);
        }

    }
    public static void main(String[] args) {
        DoctorManagement system = new DoctorManagement();
        Doctor d=new Doctor(1,"Anshika","Cardio",12);
        system.addDoctor(d);


    }

}
