public class Info {
    private int id;
    private int age;
    Info(int id ,int age){
        System.out.println("show information");
        this.id=id;
        this.age=age;
    }
    void setId(int id){
     this.id=id;
    }
    int getId(){
     return id;
    }   
    void setAge(int age){
     this.age=age;
    }
    int getAge(){
     return age;
    } 
}
