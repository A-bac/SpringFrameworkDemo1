package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Address")
public class Address {
    private String city;
    private String state;
    private String country;
    private String zipcode;


    public Address() {
    }

    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Autowired
    public void setCity(String city) {
        this.city = city;
    }

    @Autowired
    public void setState(String state) {
        this.state = state;
    }

    @Autowired
    public void setCountry(String country) {
        this.country = country;
    }

    @Autowired
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
