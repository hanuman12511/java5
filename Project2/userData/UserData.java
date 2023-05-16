package Project2.userData;

import aditya.project1.product;

public class UserData {
    private String Name;
    private String Email;
    private String product[]={"Product1","Product2"};
    private int productqty[]={12,23};
    private int productrate[]={100,200};
    private int find =-1;
    public UserData(){
        
    }
    public UserData(String Name,String Email){
        this.Name=Name;
        this.Email=Email;

    }
    public boolean login(){
        if(Name.equalsIgnoreCase("admin")||Email.equalsIgnoreCase("admin@gmail.com")){
            return true;
        }
        return false;
    }
    public  boolean product(String pd){
        for(int i=0;i<product.length;i++){
            if(pd.equalsIgnoreCase(product[i])){
                find = i;
                return true;
            }
        }
        return false;

    }
    public boolean productQty(int qty){
            if(qty<=productqty[find]){
                return true;
            }
        
        return false;

    }
    public int getProductRate(){
        return productrate[find];
    }
}
