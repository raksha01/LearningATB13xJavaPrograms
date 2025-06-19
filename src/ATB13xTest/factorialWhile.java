package ATB13xTest;

import java.util.Scanner;
import java.util.*;
public class factorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        if(sc.hasNextInt()) {
            int a = sc.nextInt();
            int i =1;
            long factorial=1l;
            while (i <= a) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("Factorial is " + factorial);
        }
        else
        {
            System.out.println("Enter an integer");
        }

    }
}
