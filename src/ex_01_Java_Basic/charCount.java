package ex_01_Java_Basic;
import java.util.*;
public class charCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String name=sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for(int i=0;i<name.length();i++) {
            char c = name.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels = "+vowels+"\nConsonants = "+consonants);
    }
}
