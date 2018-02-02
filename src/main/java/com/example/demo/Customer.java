package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.jndi.cosnaming.IiopUrl;

import javax.persistence.*;
import java.util.Set;
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long customer_Id;

    public String first_Name;

    public String last_Name;
    @OneToMany(cascade = CascadeType.ALL)
    public Set<Address> address;

    public Customer() {}




    @Override
    public String toString() {
        return "Customer{" +
                "customer_Id" + customer_Id +
                ", first_Name" + first_Name + '\'' +
                ", last_Name" + last_Name + '\'' +
                ", address" + address +
                '}';
    }
}
