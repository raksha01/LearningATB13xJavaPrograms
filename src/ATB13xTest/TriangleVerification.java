package ATB13xTest;

import java.util.*;
public class TriangleVerification {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 sides of the triangle:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (isValidTriangle(a, b, c)) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is NOT valid.");
        }

        sc.close();
    }

    static boolean isValidTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
