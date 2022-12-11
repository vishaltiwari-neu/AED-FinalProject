/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author visha_wb3uzfg
 */
public class Apartment {
    
    private int ownerId;
    private String aptNumber;
    private String address;
    private String cityName;
    private String state;
    private int bedroom;
    private float bathroom;
    private String aptType;
    private int rent;

    public Apartment(int owner, String aptNumber, String address, String cityName, String state, int bedroom, float bathroom, String aptType, int rent) {
        this.ownerId = owner;
        this.aptNumber = aptNumber;
        this.address = address;
        this.cityName = cityName;
        this.state = state;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.aptType = aptType;
        this.rent = rent;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public float getBathroom() {
        return bathroom;
    }

    public void setBathroom(float bathroom) {
        this.bathroom = bathroom;
    }

    public String getAptType() {
        return aptType;
    }

    public void setAptType(String aptType) {
        this.aptType = aptType;
    }
    
    

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
}
