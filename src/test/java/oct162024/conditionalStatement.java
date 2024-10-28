package oct162024;

public class conditionalStatement {
    public static void main(String[] args) {
        String a1 = "today is conditional statement";
        System.out.println(a1.replaceFirst("is", "of"));
        System.out.println(a1.subSequence(0, 2));
        System.out.println(a1.equals("today is conditional statement"));
        System.out.println(a1.substring(0, 2));
        System.out.println(a1.length());
        System.out.println(a1.equalsIgnoreCase("abc"));
        String a2 = "today is conditional statement";
        System.out.println(a1.length() == a2.length());
        System.out.println(a1.equals(a2));
        System.out.println(a1.substring(0, 1));
        System.out.println(a1.substring(0, 4));
        System.out.println(a1.subSequence(0, 4));
        System.out.println(a1.startsWith("to"));
        System.out.println(a1.contains("is"));
        System.out.println(a1.charAt(1));
        System.out.println();
        int x = 10;
        if (x == 30) {
            System.out.println("true");

        }
        int a = 20 + 30;
        if (a % 5 == 0 || a % 10 == 0)
            System.out.println("a is divisible with 5 and 10");
        else
            System.out.println("a is not divisible by 5 and 10");

        String s3="abc";
        if(s3.length()%3==0)
            System.out.println("divisible by 3");
        else if (s3.length()%2==1) {
            System.out.println("divisble by 2");

        }
    }

}
