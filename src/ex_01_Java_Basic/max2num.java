package ex_01_Java_Basic;

import java.util.Scanner;

public class max2num {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextFloat())
        {
            float n1 = sc.nextFloat();
            if(sc.hasNextFloat())
            {
                float n2 = sc.nextFloat();
                System.out.println("Largest number is "+large(n1,n2));
            }
            else
                System.out.println("Enter a number");
        }
        else
            System.out.println("Enter a number");
    }
    static float large(float n1, float n2)
    {
        if(n1>n2)
            return n1;
        else
            return n2;
    }
}
