package ATB13xTest;

import java.util.Scanner;

public class OperatorPrecedenceAndTypeCasting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a*b)/((a+b)%(a-b))+b+a;
        System.out.println("Result - "+c);
        float f1=a;
        System.out.println("Implicit Typecasting of "+a+" is "+f1);
        float f = 3.145f;
        a=(int)f;
        System.out.println("Explicit Typecasting of "+f+" is "+a);




    }
}
