
class Op{
    void sum(int n1,int n2){
        int r = n1+n2;
        System.out.println(r);
    }
    void sub(int n1,int n2){
        int r = n1-n2;
        System.out.println(r);
    }
    void div(int n1,int n2){
        int r=0;
        try {
         
        r = n1/n2;   
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(r);
    }
}
public class Exceptionnn {
    
    public static void main(String...rr) {
        Op o = new Op();
        int n1=8,n2=0;
        o.sum(n1,n2);
      
        o.div(n1,n2);
        o.sub(n1,n2);
        
    }
}
