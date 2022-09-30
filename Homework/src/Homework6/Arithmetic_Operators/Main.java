package Homework6.Arithmetic_Operators;

public class Main {
    public static void main(String[] args) {

        //Problem 1

        /**
         * author Slav;
         * Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում հետևյալը․
         * a + b, a + b, a / b, a - b, a % b
         */

        int a = 8;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a % b);


        //Problem 2
        /**
         * author Slav
         * Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել console -ում հետևյալը.
         * c + d , c * d , c / d , c - d , c % d
         */

        double c = 6.4;
        double d = 0.03;

        System.out.println(c + d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c - d);
        System.out.println(c % d);


        //Problem 3
        /**
         * author Slav
         * Տպել console -ում հետևյալ արտահայտությունների պատասխանները`
         * 1) int x = 2 * ((5 + 3) * 4 – 8);
         * 2) int y = 2 * 5 + 3 * 4 - 8;
         */

        //int x = 2 * ((5 + 3) * 4 – 8);
        //int x = 2 * (32 - 8)
        int x = 2 * 24;
        int y = 2 * 5 + 3 * 4 - 8;
        System.out.println(x);
        System.out.println(y);


    }
}
