package ATB13xTest;

public class operators {
    public static void main(String[] args) {
        int a = 10, b=5;
        //Arithmetic Operators
        System.out.println("Arithmetic Operator");
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));

        //Conditional Operators
        System.out.println("Conditional Operator");
        System.out.println("a==b="+(a==b));
        System.out.println("a<=b="+(a<=b));
        System.out.println("a>=b="+(a>=b));
        System.out.println("a!=b="+(a!=b));
        System.out.println("a>b="+(a>b));
        System.out.println("a>b="+(a<b));

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
