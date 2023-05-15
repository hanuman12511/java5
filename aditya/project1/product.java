package aditya.project1;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        // System.out.println("enter product name:");
        userData ud = new userData();
        Scanner s = new Scanner(System.in);
        String name[] = new String[10];
        for (int i = 0; i < 3; i++) {
            System.out.println("enter name:");
            name[i] = s.next();
        }
        ud.setproductName(name);
        System.out.println("enter quantity");
        ud.setquantity(s.nextInt());

    }
}
