package ATB13xTest;

import java.util.Scanner;

import java.util.*;
public class NewTypeOfNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            if (sc.hasNextFloat()) {
                float num = sc.nextFloat();
                if (num > 0) {
                    System.out.println(num + " is a positive number");
                } else if (num < 0) {
                    System.out.println(num + " is a negative number");
                } else {
                    System.out.println(num + " is a zero");
                }
            } else {
                System.out.println("Enter a number");
            }
        }
}
