package ATB13xTest;

import java.util.Scanner;

public class forLoop1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.println(i);
            }
        }
        else
            System.out.println("Enter an integer");
    }
}
