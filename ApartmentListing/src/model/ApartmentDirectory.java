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
public class ApartmentDirectory {

    PersonDirectory personDirectory = new PersonDirectory();

    public void addApartment(int owner, String aptNumber, String address, String cityName, String state, int beds, float bathroom, String aptType, int rent) {
        Apartment apt = new Apartment(owner, aptNumber, address, cityName, state, beds, bathroom, aptType, rent);

        Connection dbConn = Database.createConnection();

        int c = getaptcount(dbConn);

        int aptid = insertApartment(c, aptNumber, address, cityName, state, owner, beds, bathroom, aptType, dbConn);

        updateQcTable(dbConn, aptid, c);

    }

    private void updateQcTable(Connection dbConn, int aptid, int c) {
        try {
            String qcQuery = "select count(q.aptid) s, p.id from person p left join qctable q on q.qcid=p.id where p.role='QUALITYCHECKER' group by p.id order by s limit 1;";
            Statement statement = dbConn.createStatement();
            ResultSet resultSet = statement.executeQuery(qcQuery);
            while (resultSet.next()) {
                int pid = Integer.parseInt(resultSet.getString("id"));
                System.out.println(aptid);
                String qcInsertQuery = "INSERT INTO `qctable` "
                        + "(`aptid`, `qcid`, `approvedflag`) "
                        + "VALUES ('" + c + "', '" + pid + "', '" + 0 + "')";
                Statement insstatement = dbConn.createStatement();
                insstatement.executeUpdate(qcInsertQuery);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private int insertApartment(int c, String aptNumber, String address, String cityName, String state, int owner, int beds, float bathroom, String aptType, Connection dbConn) {
        String query = "INSERT INTO `Apartment`.`ApartmentDirectory` "
                + "(`id`, `apartmentnumber`, `address`, `city` ,`state`, `ownerid`, `bedroom`, `bathroom`, `apttype`) "
                + "VALUES ('" + c + "','" + aptNumber + "', '" + address + "',  '" + cityName + "' , '" + state + "','" + owner + "','" + beds + "','" + bathroom + "','" + aptType + "')";
        System.out.println(query);
        int aptid = 0;
        try {

            Statement statement = dbConn.createStatement();
            aptid = statement.executeUpdate(query);

        } catch (Exception e) {

            System.out.println(e);
        }
        return aptid;
    }

    private int getaptcount(Connection dbConn) {
        String countQuery = "select id from apartmentdirectory order by id desc limit 1";
        int c = 0;
        try {
            Statement statement = dbConn.createStatement();
            ResultSet res = statement.executeQuery(countQuery);
            while (res.next()) {
                c = Integer.parseInt(res.getString("id")) + 1;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return c;
    }

    public void deleteApartment(int id) {

        Connection dbConn = Database.createConnection();
        Statement statement;
        try {
            statement = dbConn.createStatement();
            String query = "delete from apartmentdirectory where id="+id+";";

            System.out.println(query);

            ResultSet resultSet = statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(ApartmentDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Dictionary> getApartments() {

        List<Dictionary> apartmentList = new ArrayList<>();
        try {
            Connection dbConn = Database.createConnection();
            Statement statement = dbConn.createStatement();
            String query = "Select * from apartmentdirectory";

            System.out.println(query);

            ResultSet resultSet = statement.executeQuery(query);

            int c = 0;
            while (resultSet.next()) {
                Dictionary apatment = new Hashtable();
                apatment.put("aptid", resultSet.getString("id"));
                apatment.put("apartmentNumber", resultSet.getString("apartmentNumber"));
                apatment.put("address", resultSet.getString("address"));
                apatment.put("city", resultSet.getString("city"));
//                int age = resultSet.getInt("age");
                apatment.put("state", resultSet.getString("state"));
                int id = Integer.parseInt(resultSet.getString("ownerid"));
                Person p = personDirectory.searchPersonById(id);

                apatment.put("owner", p.getuserName());

                apatment.put("ownerContact", p.getEmail());
                apatment.put("bedroom", resultSet.getString("bedroom"));
                apatment.put("bathroom", resultSet.getString("bathroom"));
                apatment.put("apttype", resultSet.getString("apttype"));

//                Apartment a = new Person(id, _name, age, _username, _password, person_role, name, name, name, email);
                apartmentList.add(apatment);
            }
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }

        return apartmentList;
    }

    public Apartment searchApartmentById(int id) {
        try {

            Connection con = Database.createConnection();
            Statement statement = con.createStatement();
            String query = "SELECT * FROM apartmentdirectory where id='" + id + "'";
            System.out.println(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String apartmentNumber = resultSet.getString("apartmentNumber");
                String address = resultSet.getString("address");
                String city = resultSet.getString("city");
                String state = resultSet.getString("state");
                int ownerId = resultSet.getInt("ownerid");
                int bedroom = resultSet.getInt("bedroom");
                float bathroom = resultSet.getFloat("bathroom");
                String apttype = resultSet.getString("apttype");
                int rent = resultSet.getInt("rent");
                int isshared = resultSet.getInt("isshared");
                Apartment a = new Apartment(ownerId, apartmentNumber, address, city, state, bedroom, bathroom, apttype, rent);
                return a;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return null;
    }

    public void deleteListing(String value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
