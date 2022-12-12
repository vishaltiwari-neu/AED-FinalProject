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
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author visha_wb3uzfg
 */
public class DealDirectory {

    public void createDeal(int brokerId, int customerId, int aptid, int minRent, int maxRent, float applicationFee, float securityDeposit, float brokerFee, int tenure) {

        Connection dbConn = Database.createConnection();

        String query = "INSERT INTO `deals` "
                + "(`brokerId`, `customerId`, `aptid`, `minRent` ,`maxRent`, `applicationFee`, `securityDeposit`, `brokerFee`, `tenure`)"
                + "VALUES ('" + brokerId + "','" + customerId + "', '" + aptid + "',  '" + minRent + "' , '" + maxRent + "','" + applicationFee + "','" + securityDeposit + "','" + brokerFee + "',  '" + tenure + "')";
        System.out.println(query);

        try {

            Statement statement = dbConn.createStatement();
            aptid = statement.executeUpdate(query);

        } catch (Exception e) {

            System.out.println(e);
        }

    }

    public List<Deals> getDealByBroker(int Id) {
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
                int tenure = resultSet.getInt("tenure");
                Deals deals = new Deals(brokerId, customerId, aptid, minRent, maxRent, applicationFee, securityDeposit, brokerFee, tenure);
                dealList.add(deals);
            }
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }

        return dealList;
    }

    public List<Deals> getDealByOwner(int Id) {
        List<Deals> dealList = new ArrayList<>();
        try {
            Connection dbConn = Database.createConnection();
            Statement statement = dbConn.createStatement();
            String query = "select * from deals d inner join apartmentdirectory a on d.aptid=a.id where a.ownerid=" + Id + ";";

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
                int tenure = resultSet.getInt("tenure");
                Deals deals = new Deals(brokerId, customerId, aptid, minRent, maxRent, applicationFee, securityDeposit, brokerFee, tenure);
                dealList.add(deals);
            }
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }

        return dealList;
    }

    public Deals searchDeal(String ownerName, String customerName) {

        PersonDirectory pd = new PersonDirectory();

        Person customer = pd.searchPersonByUsername(customerName);
        int customerId = customer.getId();

        Person owner = pd.searchPersonByUsername(ownerName);
        int ownerid = owner.getId();

        Connection dbConn = Database.createConnection();

        String query = "select * from deals d inner join apartmentdirectory a on d.aptid=a.id where d.customerId=" + customerId + " and a.ownerid=" + ownerid + "";
        System.out.println(query);

        try {
            Statement statement = dbConn.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int brokerId = resultSet.getInt("brokerId");
                int aptid = resultSet.getInt("aptid");
                int minRent = resultSet.getInt("minRent");
                int maxRent = resultSet.getInt("maxRent");
                float applicationFee = resultSet.getInt("applicationFee");
                float securityDeposit = resultSet.getInt("securityDeposit");
                float brokerFee = resultSet.getInt("brokerFee");
                int tenure = resultSet.getInt("tenure");
                Deals deals = new Deals(brokerId, customerId, aptid, minRent, maxRent, applicationFee, securityDeposit, brokerFee, tenure);
                return deals;

            }
        } catch (SQLException ex) {
            Logger.getLogger(DealDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
