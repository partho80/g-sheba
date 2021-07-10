package com.example.g_sheba;

public class Patient {
    String name;
    String age;
    String phone;
    String email;
    String date;
    String condition;

    public Patient() {
    }

    public Patient(String name, String age, String phone, String email, String date, String condition) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.date = date;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
