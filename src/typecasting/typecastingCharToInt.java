package typecasting;

public class typecastingCharToInt {
    public static void main(String[] args) {
        char c='Z';
        int a = c;
        System.out.println(a); // Printing the ASCII value
        int i1 = 174;
        char c1=(char) i1;
        System.out.println(c1); // Updating the ASCII value to char

        int i2=345;
        String str1 = Integer.toString(i2);
        System.out.println(i2);
        System.out.println(str1);
        System.out.println(i2+10);
        System.out.println(str1+10);

        String str2 = "125"; //Using string of alphabets here and typecasting it to int will throw NumberFormatException
        int i3 = Integer.parseInt(str2);
        System.out.println(i3);
        System.out.println(str2);
        System.out.println(i3+10);
        System.out.println(str2+10);

        byte b1 = 12;
        String str3 = Byte.toString(b1);
        System.out.println(b1);
        System.out.println(str3);
        System.out.println(b1+10);
        System.out.println(str3+10);

        str2 = "68";
        byte b2 = Byte.parseByte(str2);
        System.out.println(b2);
        System.out.println(str2);
        System.out.println(b2+10);
        System.out.println(str2+10);



    }
}
