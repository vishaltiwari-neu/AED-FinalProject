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
 * @author HP
 */
public class PersonDirectory {


    public void signup(String name, int age, String userName, String password, Role role, String contactNumber, String address, String cityName, String email) {

        Connection dbConn = Database.createConnection();

//        Person person = new Person(name, age, userName, password, role, aptNumber, address, cityName, email);
        String query = "INSERT INTO `Apartment`.`Person` "
                + "(`name`, `username`, `password`, `age` ,`role`, `contactnumber`, `address`, `city`, `email`) "
                + "VALUES ('" + name + "', '" + userName + "', '" + password + "',  '" + age + "' , '" + role + "', '" + contactNumber + "', '" + address + "', '" + cityName + "', '" + email + "')";
        System.out.println(query);
        try {

            Statement statement = dbConn.createStatement();
            statement.executeUpdate(query);

        } catch (Exception e) {

            System.out.println(e);
//            return null;
        }
//        return person;
    }

    public Person login(String username, String password, Role role) {

        try {

            Connection con = Database.createConnection();
            Statement statement = con.createStatement();
            String query = "SELECT * FROM Person where username='" + username + "' and password='" + password + "' ";
            System.out.println(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String _name = resultSet.getString("name");
                String _username = resultSet.getString("username");
                String _password = resultSet.getString("password");
                int age = resultSet.getInt("age");
                String _role = resultSet.getString("role");
                Role person_role = Enum.valueOf(Role.class, _role);
                String email = resultSet.getString("email");
                String name = resultSet.getString("name");
                int id = Integer.parseInt(resultSet.getString("id"));
                Person p = new Person(id, _name, age, _username, _password, person_role, name, name, name, email);
                return p;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return null;

    }

    public Person searchPersonById(int id) {
        try {

            Connection con = Database.createConnection();
            Statement statement = con.createStatement();
            String query = "SELECT * FROM person where id='" + id + "'";
            System.out.println(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String _name = resultSet.getString("name");
                String _username = resultSet.getString("username");
                String _password = resultSet.getString("password");
                int age = resultSet.getInt("age");
                String _role = resultSet.getString("role");
                Role person_role = Enum.valueOf(Role.class, _role);
                String email = resultSet.getString("email");
                String name = resultSet.getString("name");
                Person p = new Person(id, _name, age, _username, _password, person_role, name, name, name, email);
                return p;
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return null;

    }

    public List<Person> getPersonListByRole(Role role) {
        List<Person> brokerList = new ArrayList<>();
        try {

            Connection con = Database.createConnection();
            Statement statement = con.createStatement();
            String query = "SELECT * FROM person where role='" + role.toString() + "'";
            System.out.println(query);
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String _name = resultSet.getString("name");
                String _username = resultSet.getString("username");
                String _password = resultSet.getString("password");
                int age = resultSet.getInt("age");
                String _role = resultSet.getString("role");
                Role person_role = Enum.valueOf(Role.class, _role);
                String email = resultSet.getString("email");
                String name = resultSet.getString("contactnumber");
                Person p = new Person(id, _name, age, _username, _password, person_role, name, name, name, email);
                brokerList.add(p);
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return brokerList;
    }
}
