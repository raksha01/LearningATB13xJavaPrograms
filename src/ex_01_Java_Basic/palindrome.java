package ex_01_Java_Basic;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String s = sc.nextLine();
        String reverse="";
        for(int i = s.length()-1;i>=0;i--)
        {
            reverse += s.charAt(i);
        }
        if(s.equals(reverse))
        {
            System.out.println("It is a palindrome string");
        }
        else
        {
            System.out.println("It is not a palindrome string");
        }

    }
}
