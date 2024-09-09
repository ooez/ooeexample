package org.example;

public class Address {
    String street;
    String city;
    int zipCode;
    String country;


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address(String street, String city, int zipCode, String country) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }
    public void print() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("Country: " + country);
    }


}
