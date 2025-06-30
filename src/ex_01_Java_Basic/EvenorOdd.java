package ex_01_Java_Basic;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt())
        {
            f1(sc.nextInt());
        }
        else
        {
            System.out.println("Enter an integer");
        }
    }
    static void f1(int a)
    {
        if(a%2==0)
            System.out.println("It is an even number");
        else
            System.out.println("It is an odd number");
    }
}
