/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Register {
    Register(){
        System.out.println("register");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter id ");
        int id = sc.nextInt();
        System.out.println("Enter name ");
        String name = sc.next();
        System.out.println("Enter email ");
        String email = sc.next();
        System.out.println("Enter password ");
        String password = sc.next();
        boolean r = false;
        try {
             Class.forName("com.mysql.jdbc.Driver");
            String url ="jdbc:mysql://localhost:3307/java5";
            Connection con = DriverManager.getConnection(url,"root","root");
          
              Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from register where email='"+email+"'");
            System.out.println(rs);
          
             while(rs.next()) {
                 r =true;
             }
             if(r){
                 System.out.println("not register"); 
             }
             else{
                 PreparedStatement ps =con.prepareStatement("insert into register values(?,?,?,?)");
                    ps.setInt(1, id);
                    ps.setString(2, name);
                    ps.setString(3, email);
                    ps.setString(4, password);
                    
                  int i = ps.executeUpdate();
                  if(i==1){
                      Login l = new Login();
                  }
                 
                    
             }
         
        
            /* while(rs.next()) {
            System.out.print(rs.getString(1));
            System.out.println();
      }*/
        } catch (Exception e) {
        }
    }
}
