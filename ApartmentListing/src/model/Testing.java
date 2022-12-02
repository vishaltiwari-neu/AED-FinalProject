/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author visha_wb3uzfg
 */
public class Testing {

    public static void main(String[] args) {
        PersonDirectory pd = new PersonDirectory();

//        pd.signup("Vishal", 20, "vishal54", "abc", Role.CUSTOMER, "10", "address", "cityName", "email");
        Person p = pd.login("vishal54", "abc", Role.CUSTOMER);
        if (p != null) {
            System.out.println(p.getUserName());
        }
    }

}
