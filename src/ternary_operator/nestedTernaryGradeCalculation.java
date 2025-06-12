package ternary_operator;

public class nestedTernaryGradeCalculation {
    public static void main(String[] args) {
        int marksObtained=91;
        String result=(marksObtained>=90)?"A+":(marksObtained>=75)?"A":(marksObtained>=60)?"B":(marksObtained>=40)?"C":"FAIL";
        System.out.println(result);
    }
}
