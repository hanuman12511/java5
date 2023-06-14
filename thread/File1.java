package thread;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class File1 {
    public static void main(String...r) {
try {
      File f1 = new File("C:\\java\\f1.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.toPath());
        System.out.println(f1.exists());
        System.out.println(f1.createNewFile());

        FileWriter wf = new FileWriter(f1);
        wf.write("java programming");
        wf.close();


        FileReader rf =new FileReader(f1);
        int ch;
        while(( ch =rf.read())!=-1){
            System.out.print((char)ch);
        }
        if(f1.exists()){
            System.out.print("file");
        }
        else{
            System.out.println("not");
        }

    } catch (Exception e) {
     System.out.println(e);
        // TODO: handle exception
    }
    }
}
