package com.example.g_sheba;

public class AppointmentPatient {
    String doctor_name;
    String patient_name;
    String patient_phone;
    String appointment_date;
    String appointment_time;

    public AppointmentPatient() {
    }

    public AppointmentPatient(String doctor_name, String patient_name, String patient_phone, String appointment_date, String appointment_time) {
        this.doctor_name = doctor_name;
        this.patient_name = patient_name;
        this.patient_phone = patient_phone;
        this.appointment_date = appointment_date;
        this.appointment_time = appointment_time;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_phone() {
        return patient_phone;
    }

    public void setPatient_phone(String patient_phone) {
        this.patient_phone = patient_phone;
    }

    public String getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(String appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
    }
}
