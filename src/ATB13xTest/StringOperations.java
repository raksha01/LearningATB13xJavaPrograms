package ATB13xTest;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        System.out.println("Enter the String 1");
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println("Enter the String 2");
        String s2=sc.nextLine();
        System.out.println("String Concatenation "+s1+" "+s2);
        System.out.println("Length of the string "+(s1.length()+s2.length()));
        System.out.println("Enter the size of substring");
        int size=sc.nextInt();
        if(s1.length()>=size)
        {
           String sub=s1.substring(0,size);
            System.out.println("Substring from string 1"+sub);
        }
        else
            System.out.println("Your string is too short to extract substring");
        System.out.println("Enter the index number to extract substring");
        int index = sc.nextInt();
        if(s1.length()>=index&&index>=0)
        {
            char c = s1.charAt(index);
            System.out.println("Character at index "+index+" is "+c);
        }
        else
            System.out.println("Index number is too large");
    }
}
