package thread;

class Threadd extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
                // TODO: handle exception
            }
        }
    } 
}
public class Mythread {
    public static void main(String...r) {
Threadd t1 =new Threadd();
Threadd t2 =new Threadd();
Threadd t3 =new Threadd();
t1.start();
System.out.println("t1"+t1.getName());
System.out.println("t2"+t2.getName());
t1.setName("T1");
t2.setName("T2");
System.out.println("t1"+t1.getName());
System.out.println("t2"+t2.getName());

try {
    t1.join(3000);
} catch (Exception e) {
    // TODO: handle exception
}
t2.start();
t3.start();

    }
}
