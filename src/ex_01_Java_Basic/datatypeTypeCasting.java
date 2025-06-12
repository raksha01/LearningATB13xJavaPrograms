package ex_01_Java_Basic;

public class datatypeTypeCasting {
    public static void main(String[] args) {
        int a =423;
        short s1=34;
        int i1=s1;

        long l1=a;
        byte b1 = (byte)a;
        System.out.println(a);
        System.out.println(b1);

        short s2 = (short)a;
        float f1=35.76f;
        int i2 = (int)f1;
        System.out.println(f1);
        System.out.println(i2);

        int i3=45;
        float f2 = i3;
        System.out.println(i3);
        System.out.println(f2);
    }
}
