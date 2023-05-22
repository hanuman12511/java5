package Project2.admin;

import java.util.Scanner;

import Project2.userData.UserData;

public class Admin {
    private String productName;
    private int productQty;
    private String addtocartproductname[] = new String[10]; 
    private int addtocartproductqty[] = new int[10]; 
    private int addtocartproductrate[] = new int[10];
    private int nof_product=0;  
    Scanner sc=new Scanner(System.in);
    UserData ud =new UserData();
    private boolean add =false;
    private int pay=0,payment; 
    public Admin(){
        while(true){
            System.out.println();
            System.out.println("***********************");
        System.out.println("Enter product  'yes' or 'no'");
        if(sc.next().equalsIgnoreCase("no")){
            break ;
        }
        System.out.println("Enter product name ");
        productName = sc.next();
        if(ud.product(productName)){
            System.out.println("Enter product qty");
            productQty = sc.nextInt();
            if(ud.productQty(productQty)){
                addtocartproductname[nof_product] = productName;
                addtocartproductqty[nof_product] = productQty;
                addtocartproductrate[nof_product] = ud.getProductRate();
                nof_product++;
                add = true;
            }
    
        }
        System.out.println();
       if(add){
        System.out.println("name" +"\t"+"qty"+"\t"+"rate");
        for(int i=0;i<nof_product;i++){
            System.out.print(addtocartproductname[i] +"\t"+addtocartproductqty[i]+"\t"+addtocartproductrate[i]);
            pay+=addtocartproductqty[i]*addtocartproductrate[i];
            System.out.println();
        }
       
    }
        
    }
    System.out.println("");
    System.out.println("ur total pay="+pay);
    System.out.print("Enter payment=>");
    payment= sc.nextInt();
    if(pay==payment){
        System.out.println("");
        System.out.println("*****  Done  ******");
        System.out.println("");

    }
}

}
