package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 55, name = "STREET", nullable = false)
    private String street;

    @Column(length = 55, name = "NUMBER", nullable = false)
    private String number;

    @Column(length = 55, name = "COMPLEMENT", nullable = false)
    private LocalDate complement;

    @Column(length = 55, name = "DISTRICT", nullable = false)
    private String district;

    @Column(length = 55, name = "CITY", nullable = false)
    private String city;

    @Column(length = 55, name = "STATE", nullable = false)
    private String state;

    @Column(length = 55, name = "CEP", nullable = false)
    private String cep;

    public Address() {
    }

    public Address(Long id, String street, String number, LocalDate complement, String district, String city, String state, String cep) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.complement = complement;
        this.district = district;
        this.city = city;
        this.state = state;
        this.cep = cep;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getComplement() {
        return complement;
    }

    public void setComplement(LocalDate complement) {
        this.complement = complement;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
