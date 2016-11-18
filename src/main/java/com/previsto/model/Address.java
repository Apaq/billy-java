package com.previsto.model;

public class Address {

    private String city;
    private String countryName;
    private String placeName;
    private String street;
    private String zip;
    private String name;

    public Address() { }

    public Address(String name, String street, String placeName, String zip, String city, String countryName) {
        this.city = city;
        this.countryName = countryName;
        this.placeName = placeName;
        this.street = street;
        this.zip = zip;
        this.name = name;
    }

    public Address(String name, String street, String zip, String city, String countryName) {
        this.city = city;
        this.countryName = countryName;
        this.street = street;
        this.zip = zip;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
