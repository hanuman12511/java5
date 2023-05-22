package gourav.project1;

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
                else{
                    Login lg = new Login();
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
    }
}
