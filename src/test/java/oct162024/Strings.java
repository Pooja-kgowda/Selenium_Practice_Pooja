package oct162024;

import java.io.FilterOutputStream;
import java.sql.SQLOutput;

public class Strings {
    public static void main(String[] args) {
        String a1 = "This is first sentence in JAVA";
        System.out.println(a1);
        System.out.println(a1.length());
        System.out.println(a1.isEmpty());
        System.out.println(a1.isBlank());
        a1 = " ";
        System.out.println(a1.isBlank());
        System.out.println(a1.isEmpty());
        a1 = "";
        System.out.println(a1.isBlank());
        System.out.println(a1.isEmpty());
        a1 = "This is first sentence in JAVA";
        System.out.println(a1.toUpperCase());
        System.out.println(a1.toLowerCase());
        System.out.println(a1.contains("is"));
        System.out.println(a1.charAt(5));
        System.out.println(a1.startsWith("This"));
        System.out.println(a1.endsWith("java"));
        String a = "This is is first sentence in JAVA";
        System.out.println(a);
        String str="abcde".repeat(100);
        System.out.println(str);
        System.out.println(str.charAt(200));
        String str1="Counting characters in the String";
        System.out.println("Character at index 10:"+str1.charAt(10));
        String str2="abcdacdc".repeat(2);
        System.out.println(str2);
        System.out.println(str.charAt(15));


    }

}
