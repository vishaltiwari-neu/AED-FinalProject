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
public class BrokerDirectory {

    public void assignBroker(int aptid, int customerid) {
        Connection dbConn = Database.createConnection();
        try {
            String qcQuery = "select count(b.aptid) s, p.id from person p left join brokertable b on b.brokerid=p.id where p.role='BROKER' group by p.id order by s limit 1;";
            Statement statement = dbConn.createStatement();
            ResultSet resultSet = statement.executeQuery(qcQuery);
            while (resultSet.next()) {
                int pid = Integer.parseInt(resultSet.getString("id"));
                System.out.println();
                String qcInsertQuery = "INSERT INTO `brokertable` "
                        + "(`brokerid`, `aptid`, `customerid`) "
                        + "VALUES ('" + pid + "', '" + aptid + "', '" + customerid + "')";
                Statement insstatement = dbConn.createStatement();
                insstatement.executeUpdate(qcInsertQuery);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Dictionary> getBrokerDeals(int brokerId) {
        PersonDirectory pd = new PersonDirectory();
        ApartmentDirectory ad = new ApartmentDirectory();

        List<Dictionary> dealList = new ArrayList();

        Connection con = Database.createConnection();

        String query = "SELECT * FROM brokertable where brokerid='" + brokerId + "'";
        System.out.println(query);

        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Dictionary resDict = new Hashtable();
                int customerId = resultSet.getInt("customerid");

                Person person = pd.searchPersonById(customerId);

                resDict.put("customerName", person.getuserName());
                resDict.put("customerContact", person.getEmail());

                int aptid = resultSet.getInt("aptid");
                Apartment ap = ad.searchApartmentById(aptid);
                
                resDict.put("aptId", aptid);
                resDict.put("apartmentAddress", ap.getAddress());
                resDict.put("apartmentType", ap.getAptType());
                resDict.put("beds", ap.getBedroom());
                resDict.put("bath", ap.getBathroom());
                dealList.add(resDict);

            }
        } catch (SQLException ex) {
            Logger.getLogger(BrokerDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dealList;
    }
}
