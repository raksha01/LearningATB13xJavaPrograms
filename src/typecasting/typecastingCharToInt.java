package typecasting;

public class typecastingCharToInt {
    public static void main(String[] args) {
        char c='Z';
        int a = c;
        System.out.println(a); // Printing the ASCII value
        int i1 = 174;
        char c1=(char) i1;
        System.out.println(c1); // Updating the ASCII value to char
    }
}
