package ex_01_Java_Basic;
import java.util.Scanner;

public class hackerRank5 {

   public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

       int i = scan.nextInt();         // Read integer
       double d = scan.nextDouble();   // Read double
       scan.nextLine();               // Consume the leftover newline
       String s = scan.nextLine();

       // Write your code here.

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
        }

}
