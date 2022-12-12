/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author visha_wb3uzfg
 */
public class LeaseDirectory {
    
    public void assignLease(){
        
    }
    
    public List<Lease> searchLease(int lawyerId){
        List<Lease> leaseList = new ArrayList();
        
        Connection dbConn = Database.createConnection();

        String query = "select * from lease where lawyerid="+lawyerId+";";
        System.out.println(query);

        try {
            Statement statement = dbConn.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String contactNumber = resultSet.getString("contactNumber");
                String owner = resultSet.getString("owner");
                String tenant = resultSet.getString("tenant");
                int tenure = resultSet.getInt("tenure");
                String startDate = resultSet.getString("startdate");
                String enddate = resultSet.getString("enddate");
                int rent = resultSet.getInt("rent");
                int lawyerid = resultSet.getInt("lawyerid");
                int contractid = 0;
                Lease lease = new Lease(name, email, contactNumber, owner, tenant, tenure, startDate, enddate, rent, lawyerid);
                leaseList.add(lease);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DealDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return leaseList;
    }
    
    public void createLease(int lawyerid, String name, String email, String contactNumber, String owner, String customer,int tenure, String startDate, String endDate, int rent){
        
        DealDirectory d = new DealDirectory();
        
        Connection dbConn = Database.createConnection();

        Deals deal = d.searchDeal(owner, customer);
        
//        int contractId = deal.get
        
        String query = "INSERT INTO `lease` "
                + "(`name`, `email`, `contactNumber`, `owner` ,`tenant`, `tenure`, `startdate`, `enddate`, `rent`, lawyerid) "
                + "VALUES ('" + name + "', '" + email + "', '" + contactNumber + "',  '" + owner + "' , '" + customer + "', '" + tenure + "', '" + startDate + "', '" + endDate + "', '" + rent + "', '" + lawyerid + "')";
        System.out.println(query);
        try {

            Statement statement = dbConn.createStatement();
            statement.executeUpdate(query);

        } catch (Exception e) {

            System.out.println(e);
//            return null;
        }
        
    }
    
}
