package project1;

public class UserData {
    
    private int id;
    private String name;
    private String password;
    private int productId[]={1,2};
    private String productName[] ={"item1","item2"};
    private int rate[]={100,200};
    private int addtocartId[]=new int[10];
    private int addtocartQty[]=new int[10];
    private int payment;
    private String username[] = {"user1","user2"};
    private String userpassword[] = {"123","111"};
    void setId(int id){
        this.id=id;
    }
    
    int getId(){
        return id;
    }
    
    void setPassword(String password){
        this.password=password;
    }
    
    
    String getPassword(){
        return password;
    }
     void setName(String name){
        this.name=name;
    }
    
    
    String getName(){
        return name;
    }
    
   /* String[] getUserName(){
        return username;
    }
     String[] getUserPassword(){
        return userpassword;
    }*/
    
    
    boolean getuserLogin(String name,String password){
       // boolean test=false;
        for(int i=0;i<username.length;i++){
            if(name.equals(username[i])){
                if(password.equals(userpassword[i])){
                   return  true;
                  
                }
            }
        }
        
        return false;
    }
    
}
