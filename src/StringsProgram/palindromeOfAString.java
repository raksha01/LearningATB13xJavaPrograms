package StringsProgram;

import java.util.Scanner;

public class palindromeOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String rev_s= "";
        int i;
        for(i=s.length()-1;i>=0;i--)
        {
            rev_s = rev_s + s.charAt(i);
        }
        if (rev_s.equals(s))
         {
             System.out.println("It is a palindrome string");
         }
        else
            System.out.println("It is not a palindrome string");

    }
}
