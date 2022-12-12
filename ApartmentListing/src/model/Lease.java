/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author visha_wb3uzfg
 */
public class Lease {
    
    private String name;
    private String email;
    private String contactNumber;
    private String owner;
    private String tenant;
    private int tenure;
    private String startDate;
    private String enddate;
    private int rent;
    private int lawyerid;

    public Lease(String name, String email, String contactNumber, String owner, String tenant, int tenure, String startDate, String enddate, int rent, int lawyerid) {
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.owner = owner;
        this.tenant = tenant;
        this.tenure = tenure;
        this.startDate = startDate;
        this.enddate = enddate;
        this.rent = rent;
        this.lawyerid = lawyerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getLawyerid() {
        return lawyerid;
    }

    public void setLawyerid(int lawyerid) {
        this.lawyerid = lawyerid;
    }

    
    
    
}
