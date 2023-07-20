package com.pharmacy;

public class Customer extends Users{
    private String prescription;
    Customer(String fullName, String email, char sex,String phoneNumber,String prescription,String doctorName,String hospitalName){
        super(fullName,email,sex,phoneNumber);
        this.prescription = prescription;
    }
    public Customer(){

    }


    public String getDoctorName() {
        return "";
    }

    public void setDoctorName(String doctorName) {
        //this.doctorName = doctorName;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public String getHospitalName() {
        return "";
    }

    public void setHospitalName(String hospitalName) {
        //this.hospitalName = hospitalName;
    }
}
