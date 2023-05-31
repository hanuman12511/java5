/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Login {

    public Login() {
        System.out.println("login");
          Scanner sc= new Scanner(System.in);
       
        System.out.println("Enter email ");
        String email = sc.next();
        System.out.println("Enter password ");
        String password = sc.next();
         try {
             Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3307/java5";
            Connection con = DriverManager.getConnection(url,"root","root");
          
              Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from register where email='"+email+"' && password='"+password+"'");
            System.out.println(rs);
          
             while(rs.next()) {
                 System.out.println("login user");
             }
            
            
            
            
        } catch (Exception e) {
        }
    }
    
    
    
}
