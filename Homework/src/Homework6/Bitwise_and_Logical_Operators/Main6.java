package Homework6.Bitwise_and_Logical_Operators;

public class Main6 {
    public static void main(String[] args){
        /**
         * author Slav
         * Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում հետևյալը․
         */

        int a = 8;
        int b = 3;

        System.out.println(a & b);
        System.out.println(a ^ b);
        System.out.println(a | b);
        System.out.println( ~ a);
        System.out.println(true || ( a < 4 ));
        System.out.println( (b >= 6) || (++a <= 7));
        System.out.println((a < b)?a:b);
        System.out.println( b ^ b);

    }
}
