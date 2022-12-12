/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author visha_wb3uzfg
 */
public class Deals {

    private int brokerId;
    private int customerId;
    private int aptid;
    private int minRent;
    private int maxRent;
    private float applicationFee;
    private float securityDeposit;
    private float brokerFee;
    private int tenure;

    public Deals(int brokerId, int customerId, int aptid, int minRent, int maxRent, float applicationFee, float securityDeposit, float brokerFee, int tenure) {
        this.brokerId = brokerId;
        this.customerId = customerId;
        this.aptid = aptid;
        this.minRent = minRent;
        this.maxRent = maxRent;
        this.applicationFee = applicationFee;
        this.securityDeposit = securityDeposit;
        this.brokerFee = brokerFee;
        this.tenure = tenure;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public int getBrokerId() {
        return brokerId;
    }

    public void setBrokerId(int brokerId) {
        this.brokerId = brokerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAptid() {
        return aptid;
    }

    public void setAptid(int aptid) {
        this.aptid = aptid;
    }

    public int getMinRent() {
        return minRent;
    }

    public void setMinRent(int minRent) {
        this.minRent = minRent;
    }

    public int getMaxRent() {
        return maxRent;
    }

    public void setMaxRent(int maxRent) {
        this.maxRent = maxRent;
    }

    public float getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(float applicationFee) {
        this.applicationFee = applicationFee;
    }

    public float getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(float securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public float getBrokerFee() {
        return brokerFee;
    }

    public void setBrokerFee(float brokerFee) {
        this.brokerFee = brokerFee;
    }

    public void createDeal(int brokerId, int customerId, int aptid, int minRent, int maxRent, float applicationFee, float securityDeposit, float brokerFee) {

        Connection dbConn = Database.createConnection();

        String query = "INSERT INTO `deals` "
                + "(`brokerId`, `customerId`, `aptid`, `minRent` ,`maxRent`, `applicationFee`, `securityDeposit`, `brokerFee`)"
                + "VALUES ('" + brokerId + "','" + customerId + "', '" + aptid + "',  '" + minRent + "' , '" + maxRent + "','" + applicationFee + "','" + securityDeposit + "','" + brokerFee + "')";
        System.out.println(query);

        try {

            Statement statement = dbConn.createStatement();
            aptid = statement.executeUpdate(query);

        } catch (Exception e) {

            System.out.println(e);
        }

    }

}
