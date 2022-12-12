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
 * @author HP
 */
public class QualityCheckerDirectory {

    public List<Dictionary> getListings(int id) {

        PersonDirectory pd = new PersonDirectory();
        ApartmentDirectory ad = new ApartmentDirectory();

        List<Dictionary> listingList = new ArrayList();
        Connection con = Database.createConnection();
        try {
            Statement statement = con.createStatement();
            String query = "SELECT * FROM qctable where qcid='" + id + "' and isreviewd=0";
            System.out.println(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Dictionary listingDict = new Hashtable();
                String ownerName = pd.searchPersonById(id).getuserName();
                int aptId = resultSet.getInt("aptid");
                String apartmentAddress = ad.searchApartmentById(aptId).getAptNumber();
                listingDict.put("aptId", aptId);
                listingDict.put("ownerName", ownerName);
                listingDict.put("apartmentAddress", apartmentAddress);
                listingDict.put("isApproved", resultSet.getInt("approvedflag"));

                listingList.add(listingDict);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(QualityCheckerDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listingList;
    }

    public void fillFeedback(int qcid, String aptid, int smokeDetector, int carbonMonoxide, int firesafety, int escapePlan, int finalApproval, String comment) {
        Connection con = Database.createConnection();
        try {
            Statement statement = con.createStatement();
            String query = "INSERT INTO `qcfeedback` "
                    + "(`qcid`, `aptid`, `smokedetector`, `carbonmonoxide` ,`firesafety`, `escapeplan`, `finalapproval`, `comment`) "
                    + "VALUES ('" + qcid + "', '" + aptid + "', '" + smokeDetector + "',  '" + carbonMonoxide + "' , '" + firesafety + "', '" + escapePlan + "', '" + finalApproval + "', '" + comment + "')";
            
            String updateQuery = "UPDATE qctable SET isreviewed = 1 WHERE aptid="+aptid+";";
            
            statement.executeUpdate(updateQuery);
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }

    public List<Dictionary> getFeedbacks(int qcid) {
        List<Dictionary> feedbackList = new ArrayList();
        ApartmentDirectory ad = new ApartmentDirectory();
        PersonDirectory pd = new PersonDirectory();
        
        Connection con = Database.createConnection();
        try {
            Statement statement = con.createStatement();
            String query = "select * from qcfeedback where qcid=" + qcid + ";";
            System.out.println(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Dictionary feedback = new Hashtable();
                int aptid = resultSet.getInt("aptid");
                Apartment apartment = ad.searchApartmentById(aptid);
                String address = apartment.getAddress();
                int ownerId = apartment.getOwnerId();
                String owner = pd.searchPersonById(ownerId).getuserName();
                feedback.put("address", address);
                feedback.put("owner", owner);
                String finalAproval = resultSet.getInt("finalapproval") == 0 ? "False" : "True";
                feedback.put("finalApproval", finalAproval);
               feedbackList.add(feedback);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        return feedbackList;

    }

    
    public List<Dictionary> getStats(){
        List<Dictionary> statsList = new ArrayList();
        
        
        Connection dbConn = Database.createConnection();

        String query = "select count(aptid) count, qcid from qctable group by qcid;";

        System.out.println(query);

        try {
            Statement statement = dbConn.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Dictionary dict = new Hashtable();
                dict.put("qcid", resultSet.getInt("qcid"));
                dict.put("count", resultSet.getInt("count"));
                statsList.add(dict);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DealDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return statsList;
    }
}
