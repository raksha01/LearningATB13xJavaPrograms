package ATB13xTest;

import java.util.Scanner;

public class incrementAndDecrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Original:"+a);
        System.out.println("Pre Increment:"+(++a));
        System.out.println("Post Increment:"+(a++));
        System.out.println("Original:"+b);
        System.out.println("Pre Decrement:"+(--b));
        System.out.println("Post Increment:"+(b--));

    }

}
