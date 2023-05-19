package thread;

class Threadd extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    } 
}
public class Mythread {
    public static void main(String...r) {
Threadd t1 =new Threadd();
Threadd t2 =new Threadd();
Threadd t3 =new Threadd();
t1.start();
t2.start();
t3.start();

    }
}
