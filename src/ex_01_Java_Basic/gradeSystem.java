package ex_01_Java_Basic;

import java.util.*;
public class gradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        if(sc.hasNextInt())
        {
            int grade = sc.nextInt();
            if(grade>=90 && grade<=100)
            {
                System.out.println("Grade A");
            }
            else if(grade>=80 && grade<=89)
            {
                System.out.println("Grade B");
            }
            else if(grade>=70 && grade<=79)
            {
                System.out.println("Grade C");
            }
            else if(grade>=60 && grade<=69)
            {
                System.out.println("Grade D");
            }
            else if(grade>=0 && grade<=59)
            {
                System.out.println("Grade F");
            }
            else
            {
                System.out.println("Enter correct marks");
            }
        }
        else
        {
            System.out.println("Enter correct marks");
        }
    }
}
