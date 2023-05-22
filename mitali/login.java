package mitali;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println(" WELCOME TO LOGIN ");

         System.out.println(" enter the name and passward");
         String username = sc.nextLine();
         String passward = sc.nextLine();
         if(username.equals("mitali") & passward.equals("mitali")){
            System.out.println("--------WELCOME ---------------------");
         }
         else{
            System.out.println(" PLEASE ENTER THE VALID LOGIN ID ");
         }
    }
}
