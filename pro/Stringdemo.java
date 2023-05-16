public class Stringdemo {
    public static void main(String []r) {
        String str1 = "java";
        String str2 = "java";
        String str3 = "Java";
       str1.concat(str3);
        System.out.println(str1);
        
        System.out.println(str1+"=="+str2+"="+(str1==str2));
        System.out.println(str1+"=="+str3+"="+(str1==str3));

String str4 = new String("java");
String str5 = new String("java");
String str6 = new String("Java");


System.out.println(str4+"=="+str5+"="+(str4.equals(str5)));
System.out.println(str4+"=="+str6+"="+(str4.equalsIgnoreCase(str6)));
StringBuffer sf =new StringBuffer("JAVA");
sf.append(str6);
System.out.println(sf);
StringBuilder sb = new StringBuilder("java");
sb.append(str6);


System.out.println(sb);

    }
    
}
