package ex_01_Java_Basic;

import java.util.Scanner;

public class LargestOf3Nums {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers");
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextFloat())
        {
            float n1 = sc.nextFloat();
            if(sc.hasNextFloat())
            {
                float n2 = sc.nextFloat();
                if(sc.hasNextFloat()) {
                    float n3 = sc.nextFloat();
                    System.out.println("Largest number is " + large(n1, n2, n3));
                }
                else
                    System.out.println("Enter a number");
            }
            else
                System.out.println("Enter a number");
        }
        else
            System.out.println("Enter a number");
    }
    static float large(float n1, float n2, float n3)
    {
        if(n1>n2&&n1>n3)
            return n1;
        else if(n2>n3)
            return n2;
        else
            return n3;
    }
}
