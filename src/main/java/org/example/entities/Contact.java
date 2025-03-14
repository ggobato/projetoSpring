package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 55, name = "PHONE", nullable = false)
    private String phone;

    @Column(length = 55, name = "MOBILENUMBER", nullable = false)
    private String mobileNumber;

    @Column(length = 55, name = "EMAIL", nullable = false)
    private String email;

    public Contact() {
    }

    public Contact(Long id, String phone, String mobileNumber, String email) {
        this.id = id;
        this.phone = phone;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
