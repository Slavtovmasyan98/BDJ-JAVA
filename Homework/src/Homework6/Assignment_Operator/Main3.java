package Homework6.Assignment_Operator;

public class Main3 {
    public static void main (String[] args){
        //Problem 5
        /**
         * author Slav
         * Տպել console -ում հետևյալ արտահայտությունների պատասխանները`
         *
         * 1) int x = (int)1.0;
         * 2) short y = (short)1921222;
         * 3) System.out.print(2147483647+1);
         * 4) long y = (x=3);
         * 5) boolean y = false;
         * boolean x = (y = true);
         * System.out.println(x);
         */

//        int x = (int)1.0;
//        System.out.println(x);
//
//        short y = (short) 1921222;
//        System.out.println(y);

         System.out.print(2147483647+1);

//        long y = (x = 3);

         boolean y = false;
         boolean x = (y = true);
         System.out.println(x);
    }
}
