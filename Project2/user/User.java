package Project2.user;

import java.util.Scanner;

import Project2.admin.Admin;
import Project2.userData.UserData;

public class User {
    public static void main(String...r) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter username and email");
        UserData ud =new UserData(sc.next(),sc.next());
        if(ud.login()){
            System.out.println("user Login");
            while(true){
                System.out.println();
                System.out.println("****************************");
                System.out.println("logout enter 'yes' ");
                if(sc.next().equalsIgnoreCase("yes")){
                    return ;
                }
                Admin ad =new Admin();
        }
        }
    }
    
}
