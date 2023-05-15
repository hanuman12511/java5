package aditya.project1;

import java.util.Scanner;

public class payment {
    public static void main(String[] args) {
        System.out.println("Payment optios \n 1.Netbanking \n 2.UPI \n 3.Cash on delivery");
        Scanner py = new Scanner(System.in);
        userData ud = new userData();
        ud.setpayoption(py.nextInt());
        switch (ud.getpayoption()) {
            case 1:
                System.out.println("netbanking");
                break;
            case 2:
                System.out.println("UPI");
                break;
            case 3:
                System.out.println("Cash on devilvery");
                break;
            default:
                System.out.println("plese select the given options");
        }
    }
}
