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
public class LawyerDirectory {

    public List<Dictionary> getStats() {
        List<Dictionary> statList = new ArrayList();

        Connection dbConn = Database.createConnection();

        String query = "select count(name) count, lawyerid from lease group by lawyerid;";
        System.out.println(query);

        try {
            Statement statement = dbConn.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Dictionary dict = new Hashtable();
                dict.put("lawyerid", resultSet.getInt("lawyerid"));
                dict.put("count", resultSet.getInt("count"));
                statList.add(dict);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DealDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return statList;
    }

}
