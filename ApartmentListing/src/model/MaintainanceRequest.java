/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author visha_wb3uzfg
 */
public class MaintainanceRequest {
    
    private int customerid;
    private int maintainanceid;
    private String date;
    private String complaintType;
    private String complaint;

    public MaintainanceRequest(int customerid, int maintainanceid, String date, String complaintType, String complaint) {
        this.customerid = customerid;
        this.maintainanceid = maintainanceid;
        this.date = date;
        this.complaintType = complaintType;
        this.complaint = complaint;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getMaintainanceid() {
        return maintainanceid;
    }

    public void setMaintainanceid(int maintainanceid) {
        this.maintainanceid = maintainanceid;
    }
    
    
    
}
