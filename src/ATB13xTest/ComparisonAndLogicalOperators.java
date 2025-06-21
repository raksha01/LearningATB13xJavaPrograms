package ATB13xTest;

import java.util.Scanner;

public class ComparisonAndLogicalOperators
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Conditional Operator");
        System.out.println("a==b="+(a==b));
        System.out.println("a<=b="+(a<=b));
        System.out.println("a>=b="+(a>=b));
        System.out.println("a!=b="+(a!=b));
        System.out.println("a>b="+(a>b));

        //Logical Operators
        System.out.println("Logical Operator");
        Boolean b1 = true, b2= false;
        System.out.println("a&&b="+(b1&&b2));
        System.out.println("a||b="+(b1||b2));

    }
}
