package Project2.admin;

import java.util.Scanner;

import Project2.userData.UserData;

public class Admin {
    private String productName;
    private int productQty;
    private String addtocartproductname[] = new String[10];
    private int addtocartproductqty[] = new int[10];
    private int addtocartproductrate[] = new int[10];
    private int nof_product = 0;
    Scanner sc = new Scanner(System.in);
    UserData ud = new UserData();
    private boolean add = false;
    private int pay = 0, payment, payoptions;

    public Admin() {
        while (true) {
            System.out.println();
            System.out.println("***********************");
            System.out.println("Enter product  'yes' or 'no'");
            if (sc.next().equalsIgnoreCase("no")) {
                break;
            }
            System.out.println("Enter product name ");
            productName = sc.next();

            try {
                if (ud.product(productName)) {
                    System.out.println("Enter product qty");
                    productQty = sc.nextInt();
                    if (ud.productQty(productQty)) {
                        addtocartproductname[nof_product] = productName;
                        addtocartproductqty[nof_product] = productQty;
                        addtocartproductrate[nof_product] = ud.getProductRate();
                        nof_product++;
                        add = true;
                    }

                }
            } catch (Exception e) {
                System.out.println("product not found");
            }
            System.out.println();
            if (add) {
                System.out.println("name" + "\t" + "qty" + "\t" + "rate");
                for (int i = 0; i < nof_product; i++) {
                    System.out.print(
                            addtocartproductname[i] + "\t" + addtocartproductqty[i] + "\t" + addtocartproductrate[i]);
                    pay += addtocartproductqty[i] * addtocartproductrate[i];
                    System.out.println();
                }

            }

        }
        System.out.println("");
        System.out.println("your total pay=" + pay);
        System.out.println("Payment optios \n 1.Netbanking \n 2.UPI \n 3.Cash on delivery");
        payoptions = sc.nextInt();
        switch (payoptions) {
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
        System.out.print("Enter payment=>");
        System.out.println();
        payment = sc.nextInt();
        if (pay == payment) {
            System.out.println("");
            System.out.println("*****  Done  ******");
            System.out.println("");

        } else {
            System.out.println("please pay the given amount.");
        }
    }

}
