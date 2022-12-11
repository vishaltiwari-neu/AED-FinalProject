/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author visha_wb3uzfg
 */
public class Lawyer extends Person {

    private String license;

    public Lawyer(int id, String name, int age, String userName, String password, Role role, String contact, String address, String cityName, String email, String license) {
        super(id, name, age, userName, password, role, contact, address, cityName, email);
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
    
    

}
