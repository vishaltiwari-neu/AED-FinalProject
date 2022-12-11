/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author visha_wb3uzfg
 */
public class DealDirectory {

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

    public List<Deals> getDealById(int Id) {
        List<Deals> dealList = new ArrayList<>();
        try {
            Connection dbConn = Database.createConnection();
            Statement statement = dbConn.createStatement();
            String query = "Select * from deals where brokerid='" + Id + "'";

            System.out.println(query);

            ResultSet resultSet = statement.executeQuery(query);

            int c = 0;
            while (resultSet.next()) {
                int brokerId = resultSet.getInt("brokerId");
                int customerId = resultSet.getInt("customerId");
                int aptid = resultSet.getInt("aptid");
                int minRent = resultSet.getInt("minRent");
                int maxRent = resultSet.getInt("maxRent");
                float applicationFee = resultSet.getInt("applicationFee");
                float securityDeposit = resultSet.getInt("securityDeposit");
                float brokerFee = resultSet.getInt("brokerFee");
                Deals deals = new Deals(brokerId, customerId, aptid, minRent, maxRent, applicationFee, securityDeposit, brokerFee);
                dealList.add(deals);
            }
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }

        return dealList;
    }

}
