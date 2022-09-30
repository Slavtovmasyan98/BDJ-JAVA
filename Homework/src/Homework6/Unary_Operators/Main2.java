package Homework6.Unary_Operators;

public class Main2 {
    public static void main(String[] args) {

        //Problem 4
        /**
         * author Slav
         * Ստեղծել 2 փոփոխական(int e = 10, int f = -88, boolean n1 = true), տպել console -ում հետևյալը․
         * 1)-e
         * 2)-f
         * 3)+e
         * 4)-e +92
         * 5)!n1
         * 6)!(!n1)
         * 7)e++
         * 8)--f
         * 9) int x = 3;
         * int y = ++x * 5 / x-- + --x;
         * System.out.println(x is  + x);
         * System.out.println(y is  + y);
         */

        int e = 10;
        int f = -88;
        boolean n1 = true;
        int x = 3;
        int y = ++x * 5 / x-- + --x;


        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);
        System.out.println("x is " + x);
        System.out.println("y is " + y);

    }
}
