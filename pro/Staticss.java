public class Staticss {
    static int id =6;
    static void show(){
        System.out.println(id);
    }
    static{
        System.out.println(id);
        
    }
    public static void main(String [] s) {
        System.out.println("main");
        //Staticss ss =new Staticss();
        Staticss.id=9;
        Staticss.show();
    }
    
}
