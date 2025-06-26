package ATB13xTest;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1");
        String s1=sc.nextLine();
        System.out.println("Enter the String 2");
        String s2=sc.nextLine();
        if(s1==s2)
        {
            System.out.println("Strings are same using == operator");
        }
        else
        {
            System.out.println("String are not same using == operator");
        }
        if(s1.equals(s2))
        {
            System.out.println("Strings are same using equals operator");
        }
        else
        {
            System.out.println("String are not same using equals operator");
        }
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Strings are same using equalsIgnoreCase operator");
        }
        else
        {
            System.out.println("String are not same using equalsIgnoreCase operator");
        }


    }
}
