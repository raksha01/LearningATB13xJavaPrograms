package ex_01_Java_Basic;
import java.util.*;
public class vowel {
public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a character");
            char ch = sc.next().toLowerCase().charAt(0);
            if(ch<'a' || ch>'z')
                System.out.println("It is not a character");
            else if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                System.out.println("It is a vowel");
            else
                System.out.println("Oops!! it is not a vowel");
        }
    }

