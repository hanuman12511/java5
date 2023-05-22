

abstract class Info1{
    void show(){
        System.out.println("Show all info");
    }
 }

class Superr extends Info1{
    private int id;
    Superr(int id){
        this.id=id;
    }
    void show1(){
        System.out.println("id="+id);
    
    }
}
class Emp extends Superr{
    private int age;
    Emp(int id,int age){
        super(id);
        this.age=age;
    }
    void show(){
        System.out.println("age="+age);
        super.show();
    }
}
public class Inheritanceee {
    
    public static void main(String []r) {

        Info1 in =new Superr(2);
        in.show();
      //  in.show1();
        Emp e=new Emp(1,30);
        //e.id=9;
        e.show();
    }
}
