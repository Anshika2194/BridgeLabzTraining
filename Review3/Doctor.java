package com.hospital.doctor;
public class Doctor{
    private int docId;
    private String docName;
    private String spe;
    private int exp;
    Doctor(int docId,String docName,String spe,int exp){
        this.docId=docId;
        this.docName=docName;
        this.spe=spe;
        this.exp=exp;
    }
    public int getDoctorId() {
        return docId;
    }
    public void setDoctorId(int docId) {
        this.docId = docId;
    }

    public String getDoctorName() { return docName; }
    public void setDoctorName(String docName) { this.docName = docName; }

    public String getSpecialization() {
        return spe;
    }
    public void setSpecialization(String spe) {
        this.spe = spe;
    }

    public int getExperience() {
        return exp;
    }
    public void setExperience(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return String.format("ID:" +docId + "Name:"  +docName+ "Specialization:" +spe +" Experience: "+exp);

    }



}