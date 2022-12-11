/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author visha_wb3uzfg
 */
public class ApartmentDirectory {

    public void addApartment(int owner, String aptNumber, String address, String cityName, String state, int beds, float bathroom, String aptType) {
        Apartment apt = new Apartment(owner, aptNumber, address, cityName, state, beds, bathroom, aptType);

        Connection dbConn = Database.createConnection();
        
        String query = "INSERT INTO `Apartment`.`ApartmentDirectory` "
                + "(`apartmentnumber`, `address`, `city` ,`state`, `ownerid`, `bedroom`, `bathroom`, `apttype`) "
                + "VALUES ('" + aptNumber + "', '" + address + "',  '" + cityName + "' , '" + state + "','" + owner + "','" + beds + "','" + bathroom + "','" + aptType + "')";


        System.out.println(query);
        try {

            Statement statement = dbConn.createStatement();
            statement.executeUpdate(query);

        } catch (Exception e) {

            System.out.println(e);
        }

    }

}
