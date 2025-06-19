package ATB13xTest;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        //Arithmetic Operators
        System.out.println("Arithmetic Operator");
        System.out.println("Addition:"+(a+b));
        System.out.println("Substraction:"+(a-b));
        System.out.println("Multiplication:"+(a*b));
        System.out.println("Division:"+(a/b));
        System.out.println("Modulus:"+(a%b));

        //Assignment Operators
        System.out.println("Assignment Operator");
        a=b;
        System.out.println("a is equal "+a);
        a+=a;
        System.out.println("a+= ="+a);
        a-=a;
        System.out.println("a-= ="+a);

        //Conditional Operators
        System.out.println("Conditional Operator");
        System.out.println("a==b="+(a==b));
        System.out.println("a<=b="+(a<=b));
        System.out.println("a>=b="+(a>=b));
        System.out.println("a!=b="+(a!=b));
        System.out.println("a>b="+(a>b));
        System.out.println("a<b="+(a<b));

        //Logical Operators
        System.out.println("Logical Operator");
        Boolean b1 = true, b2= false;
        System.out.println("a&&b="+(b1&&b2));
        System.out.println("a||b="+(b1||b2));

        //Ternary Operator
        System.out.println("Ternary Operator");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);


    }
}
