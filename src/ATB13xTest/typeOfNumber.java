package ATB13xTest;

import java.util.Scanner;

public class typeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextFloat())
        {
            float num=sc.nextFloat();
            if(num>0)
            {
                System.out.println("It is a positive number");
            }
            else if(num<0)
            {
                System.out.println("It is a negative number");
            }
            else
            {
                System.out.println("It is a zero");
            }
        }
        else
        {
            System.out.println("Enter a number");
        }
    }
}
