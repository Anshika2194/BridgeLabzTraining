package com.hospital.doctor;

public class Patient {
    private int patientId;
    private String patientName;
    private int bednum;
    Patient(int patientId,String patientName,int bednum){
        this.patientId=patientId;
        this.patientName=patientName;
        this.bednum=bednum;
    }
    public int getPatientId() {
        return patientId;
    }
    public void setPatientId(int patientId) {
        this.patientId=patientId;
    }
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }

    public int getBednum() {
        return bednum;
    }
    public void setBednum(int bednum) {
        this.bednum = bednum;
    }

    @Override
    public String toString() {
        return String.format("ID:" +patientId + "Name:"  +patientName+ " Bed Number: "+bednum);

    }

}
