package com.project.hms.Model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
    
    
    private String name;
    private String number;
    @Id
    private String email;
    private String date;

    public Book(){

    }
    

    public Book(String name, String number, String email, String date) {
        
        this.name = name;
        this.number = number;
        this.email = email;
        this.date = date;
    }


    
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
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
    

    @Override
    public String toString() {
        return "Book [name=" + name + ", number=" + number + ", email=" + email + ", date=" + date + "]";
    }
    



}
