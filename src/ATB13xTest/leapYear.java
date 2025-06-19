package ATB13xTest;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check leap year ");
        if(sc.hasNextInt())
        {
            int year = sc.nextInt();
            if ((year%4==0 && year%100!=0) || year%400 ==0)
            {
                System.out.println("It is a leap year");
            }
            else
            {
                System.out.println("It is not a leap year");
            }
        }
        else
        {
            System.out.println("Enter a valid year");
        }

    }
}
