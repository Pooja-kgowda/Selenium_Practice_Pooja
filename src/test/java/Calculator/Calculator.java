package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int cal1,cal2;
        System.out.println("Enter two values:");
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int a=sc.nextInt();
            System.out.println("yes");
        }
        else
            System.out.println("false");
        /////////
    }
}
