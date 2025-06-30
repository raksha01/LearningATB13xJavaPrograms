package ex_01_Java_Basic;

import java.util.Scanner;

public class IntegerType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextFloat())
        {
            f1(sc.nextFloat());
        }
        else
        {
            System.out.println("Enter a number");
        }
    }
    static void f1(float a)
    {
        if(a>0)
            System.out.println("It is a positive number");
        else if (a<0)
            System.out.println("It is a negative number");
        else
            System.out.println("Number is zero");
    }

}
