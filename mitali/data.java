package mitali;

public class data {
    private int id;
    private int productId[]={1,2};
    private String productName[] ={"item1","item2"};
    private int rate[]={100,200};
    private int addtocartId[]=new int[10];
    private int addtocartQty[]=new int[10];
    private int payment;

    void setId(int id){
        this.id=id;
    }
    
    int getId(){
        return id;
    }
     void setProductId(int productId[]){
       this.productId=productId;
     }
     
    }
