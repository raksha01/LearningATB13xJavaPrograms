package ATB13xTest;

public class incrementPrePost {
    public static void main(String[] args) {
        int i=5;
        System.out.println(i++); // i=5
        System.out.println(++i); // i=7
        System.out.println(i++ + ++i); // i++ = 7; ++i = 9; i=16
    }
}
