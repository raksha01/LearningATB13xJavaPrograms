package ex_01_Java_Basic;

import java.util.Scanner;

public class ATMWithdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bankBalance = 10000;

        System.out.println("Enter the amount to Withdraw:");

        if (sc.hasNextInt()) {
            int amountToWithdraw = sc.nextInt();
            if ((amountToWithdraw==0))
                System.out.println("Enter the amount greater than 0");
            else if (amountToWithdraw % 100 != 0) {
                System.out.println("Enter the amount in multiples of 100 only.");
            } else if (amountToWithdraw > bankBalance) {
                System.out.println("Insufficient balance.");
            } else {
                System.out.println("Amount to Withdraw: " + amountToWithdraw);
                System.out.println("Please wait, amount is getting withdrawn...");
                System.out.println("------------------------------");
                System.out.println("Amount " + amountToWithdraw + " is withdrawn.");
                System.out.println("Remaining Balance: " + (bankBalance - amountToWithdraw));
            }
        } else {
            System.out.println("Invalid input! Please enter a valid number.");
        }

    }
}
