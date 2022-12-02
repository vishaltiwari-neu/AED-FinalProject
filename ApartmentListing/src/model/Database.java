/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author visha_wb3uzfg
 */
public class Database {
    
        public static Connection createConnection(){
        
        Connection con=null;
        final String DB_URL ="jdbc:mysql://localhost:3306/apartment";
        final String DB_USER = "root";
        final String DB_PASSWD = "root";
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("A");
//            Logger.getLogger(Testing.class.getName()).log(Level.SEVERE, null, ex);
        }
        try
         {
            
            con=DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWD);
            System.out.println("Connection Successful");
         }
        catch (Exception e){
            System.out.println(e);
            }
        return con;
    }
    
    
}
