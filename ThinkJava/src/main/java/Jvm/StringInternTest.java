package Jvm;

public class StringInternTest {
  
    public static void main(String[] args) {  
  
        String str1 = new StringBuilder("chaofan").append("wei").toString();  
        System.out.println(str1.intern() == str1);  
  
        String str2 = new StringBuilder("ja").append("va").toString();  
        System.out.println(str2.intern() == str2);


        String a = "abc";
        String b = "abc";
        String c = "a" + "b" + "c";
        String d = "a" + "bc";
        String e = "ab" + "c";

        System.out.println(a == b);//true
        System.out.println(a == c);//true
        System.out.println(a == d);//true
        System.out.println(a == e);//true
        System.out.println(c == d);//true
        System.out.println(c == e);//true
    }  
}  