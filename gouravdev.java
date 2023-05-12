import java.util.Scanner;

class login{
    private int id1;
    private String pass1;
    private int id2;
    private String pass2;
    private boolean flag = false;

    login(int id1, String pass1, int id2, String pass2){
        this.id1 = id1;
        this.pass1 = pass1;
        this.id2 = id2;
        this.pass2 = pass2;
    }

    boolean input(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter user id");
        int user = sc.nextInt();

        System.out.println("enter user id password");
        String password = sc.next();

        if((id1 == user && pass1.equals(password)) || (id2 == user && pass2.equals(password))){
            System.out.println("User verified");
            flag = true;
            return flag;
        }
        else{
            System.out.println("try again");
            return flag;
        }
    }
}

class cart{
    public String[] fruits;
    private int[] prices;
    private int index;
    private int kg;

    cart(String[] fruits, int[] prices){
        this.fruits = fruits;
        this.prices = prices;
    }

    void show(){
        for(int i=0; i<fruits.length; i++){
            System.out.print(fruits[i]+" ");
        }
        System.out.println();

        for(int i=0; i<prices.length; i++){
            System.out.print(prices[i]+" ");
        }
        System.out.println();
    }

    void buy(){

        Scanner sc = new Scanner(System.in);

        System.out.println("choose which fruit to buy by index starting with 0");
        index = sc.nextInt();
        System.out.println("how much quantity");
        kg = sc.nextInt();
    }

    void pay(){
        int price = prices[index]*kg;
        System.out.println("total price is " + price);
    }
}

public class gouravdev {
    public static void main(String[] args) {
        int id1 = 101;
        String pass1 = "abc";
    
        int id2 = 102;
        String pass2 = "mnp";

        login ch = new login(101, "abc", 102, "mnp");
        boolean flag = ch.input();

        Scanner sc = new Scanner(System.in);

        if(flag){
            String[] fruits = {"apple", "banana", "mango", "orange", "grapes"};
            int[] prices = {50, 30, 80, 40, 60};

            cart f = new cart(fruits, prices);
            f.show();
            f.buy();
            f.pay();
        }
    }
}
