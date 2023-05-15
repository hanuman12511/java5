package aditya.project1;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        System.out.println("enter product name:");
        userData ud = new userData();
        Scanner s = new Scanner(System.in);
        ud.setproductName(s.next());
        System.out.println("enter quantity");
        ud.setquantity(s.nextInt());
        
    }
}
