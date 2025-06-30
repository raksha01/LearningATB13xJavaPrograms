package ex_01_Java_Basic;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");

        char ch = sc.next().charAt(0);  // Read the first character of input

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is NOT an alphabet.");
        }

    }
}