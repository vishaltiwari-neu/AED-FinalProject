/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visha_wb3uzfg
 */
public class MaintainanceRequestDirectory {

    public void createMaintainanceRequest(int customerid, String date, String complaintType, String complaint) {
        Connection dbConn = Database.createConnection();

        String query = "INSERT INTO `maintainancerequest` "
                + "(`customerid`, `date`, `complainttype` ,`complaint`) "
                + "VALUES ('" + customerid + "', '" + date + "',  '" + complaintType + "' , '" + complaint + "')";
        System.out.println(query);
        try {

            Statement statement = dbConn.createStatement();
            statement.executeUpdate(query);

        } catch (Exception e) {

            System.out.println(e);
        }

    }

    public void assignPerson(int customerid, String date, String complainttype, String complaint) {
        Connection dbConn = Database.createConnection();
        complainttype = complainttype.toLowerCase();
        try {
            String qcQuery = "select count(m.date) s, p.id from person p left join maintainancerequest m on m.repairerid=p.id where p.role='PLUMBER' group by p.id order by s limit 1;";
            Statement statement = dbConn.createStatement();
            ResultSet resultSet = statement.executeQuery(qcQuery);
            while (resultSet.next()) {
                int repairerid = Integer.parseInt(resultSet.getString("id"));
                System.out.println(repairerid);
                String qcInsertQuery = "INSERT INTO `maintainancerequest` "
                        + "(`customerid`, `date`, `complainttype`, `complaint`, `repairerid`)"
                        + "VALUES ('" + customerid + "', '" + date + "', '" + complainttype + "', '" + complaint + "', '" + repairerid + "')";
                Statement insstatement = dbConn.createStatement();
                insstatement.executeUpdate(qcInsertQuery);

                break;

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public List<MaintainanceRequest> getMaintainanceRequest(int repid, String complainttype) {
        List<MaintainanceRequest> maintainanceRequest = new ArrayList<>();
        Connection dbConn = Database.createConnection();
        complainttype = complainttype.toLowerCase();
        try {
            String qcQuery = "select * from maintainancerequest where repairerid=" + repid + " and complainttype="+ complainttype +";";
            Statement statement = dbConn.createStatement();
            ResultSet resultSet = statement.executeQuery(qcQuery);
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customerid");
                String date = resultSet.getString("date");
                String complaintType = resultSet.getString("complainttype");
                String complaint = resultSet.getString("complaint");
                int repairerid = resultSet.getInt("repairerid");
                int id = resultSet.getInt("id");

                MaintainanceRequest mr = new MaintainanceRequest(customerId, repairerid, date, complaintType, complaint);
                maintainanceRequest.add(mr);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return maintainanceRequest;
    }
}
