/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
int num =3;
        while(true)
        {
            System.out.println("Enter name and password");
            Scanner sc=new Scanner(System.in);
            UserData ud =new UserData();
            if(ud.getuserLogin(sc.next(),sc.next())){
                
               // System.out.println("login");
                System.out.println("logout enter 'yes' or No'");
                
                if(sc.next().equals("yes")){
                    break;
                }
            }
            else{
                System.out.println("not login");
                if(num>1){
                    num--;
                }
                else
                {
                    break;
                }
            }

       }
        //Login lg = new Login();
    }
 
}
