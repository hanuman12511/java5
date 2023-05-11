interface data{
    void display();
}

interface Info extends data{
    int id=9;
    void show();
    default void show1(){
        System.out.println("default method");
    }

    static void show2(){
        System.out.println("static method");
    }

}

class Emp implements Info{
    public void show(){
        System.out.println(id);
    }
    public void display(){
        
    }
}

class Result extends Emp implements data{
    
}

public class Dinterfacedemo {
    
    public static void main( String...r) {
        
        Emp e =new Emp();
        e.show();
        e.show1();
        //e.show2();
        Info d= new Emp();
        Info.show2();
    }
}
