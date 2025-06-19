package ATB13xTest;

import java.util.Scanner;

public class switchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter a number to perform the operation - \n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        int op = sc.nextInt();
        switch (op) {
            case 1: {
                System.out.println("Addition - a + b = " + (a + b));
                break;
            }
            case 2: {
                System.out.println("Substraction - a - b = " + (a - b));
                break;
            }
            case 3: {
                System.out.println("Multiplication - a * b = " + (a * b));
                break;
            }
            case 4: {
                System.out.println("Division - a / b = " + (a / b));
                break;
            }
            default:
                System.out.println("Enter a correct number");
        }

    }
}
