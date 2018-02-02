package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @JsonProperty("street_number")
    public String streetNumber;
    @JsonProperty("street_name")
    public String streetName;
    public String city;
    public String state;
    public String zip;

    public Address() { }




    @Override
    public String toString() {
        return "Address{" +
                "id" + id +
                ", street_number" + streetNumber + '\'' +
                ", street_name" + streetName + '\'' +
                ", city" + city + '\'' +
                ", state" + state + '\'' +
                ", zip" + zip + '\'' +
                '}';
    }
}
