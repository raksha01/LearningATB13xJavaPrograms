package ex_01_Java_Basic;

public class TriangleClassifier {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 30;
        if(a==b & a==c)
        {
            System.out.println("It is an equilateral triangle");
        }
        else if(a==b || a==c || b==c)
        {
            System.out.println("The triangle is Isosceles.");
        }
        else
        {
        System.out.println("The triangle is Scalene.");
        }

    }
}
