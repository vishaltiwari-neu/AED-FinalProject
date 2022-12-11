/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author visha_wb3uzfg
 */
public class Broker extends Person{

    private int createdBy;
    
    public Broker(int id, String name, int age, String userName, String password, Role role, String contact, String address, String cityName, String email, int createdBy) {
        super(id, name, age, userName, password, role, contact, address, cityName, email);
        this.createdBy = createdBy;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }
    
    
    
    
}
