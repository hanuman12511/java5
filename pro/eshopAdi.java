import java.util.Scanner;

class Login {

    String username, password;
    Scanner sc = new Scanner(System.in);

    void show() {
        System.out.println("enter username");
        username = sc.nextLine();
        System.out.println("enter password");
        password = sc.nextLine();
    }

    void display() {
        if (username.equals("user1@gmail.com") && password.equals("password1")) {
            System.out.println("correct username and password");
        } else if (username.equals("user2@gmail.com") && password.equals("password2")) {
            System.out.println("correct username and password");
        } else {
            System.out.println("incorrect username or password");
        }
    }
}

class product {
    String pname[] = { "mango", "apple", "banana" };
    int price[] = { 50, 60, 30 };
    String product;
    private int quantity;
    private int cost;
    int totprice;
    Scanner s = new Scanner(System.in);

    void show1() {
        System.out.println("currently available products:");
        for (int j = 0; j <= 2; j++) {
            System.out.println(pname[j]);
        }
        System.out.println("enter product name ");
        product = s.nextLine();
        System.out.println("enter quantity ");
        quantity = s.nextInt();
    }

    void display1() {
        for (int i = 0; i <= 2; i++) {
            if (product.equals(pname[i])) {
                System.out.println("product:" + product);
                cost = price[i];
                totprice = (quantity * cost);
                System.out.println("total price: " + totprice);
            }
        }
    }
}

class cart extends product {

}

class paymentt {
    int Poption;
    Scanner sp = new Scanner(System.in);

    void show3() {
        System.out.println("Payment optios \n 1.Netbanking \n 2.UPI \n 3.Cash on delivery");
        Poption = sp.nextInt();

    }

    void display3() {
        switch (Poption) {
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

public class eshopAdi {
    public static void main(String[] args) {
        Login l = new Login();
        l.show();
        l.display();
        product p = new product();
        p.show1();
        p.display1();

        paymentt py = new paymentt();
        py.show3();
        py.display3();
    }
}
