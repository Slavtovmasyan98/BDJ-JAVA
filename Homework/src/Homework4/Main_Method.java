package Homework4;


public class Main_Method {
    public static void main(String[] args) {
        method_1(5,8);
        method_2();
        method_3(true);
        method_4('A');

        float result = method_5(5.3f,6.1f);
        System.out.println(result);

        int result1 = sum(1,5);
        System.out.println(result1);
    }

    //Problem 1
    /**
     * @author Slav
     * @param a,b;
     * This method has two input parameters type int and return 0.
     **/

        public static int method_1 (int a, int b) {

            System.out.println(a+" "+b);
            return 0;
        }

    //Problem 2

    /**
     * @author Slav
     * This method not have input parameters and returns nothing.
     **/
    public static void method_2() {
        System.out.println("hello");
    }


    //Problem 3

    /**
     * @author Slav
     * @param b;
     * This method has boolean input parameter and print “Hello World”.
     * unmeaning-full function , still work)
     **/
    public static void method_3(boolean b) {

        System.out.println("Hello World");


    }

    //Problem 4

    /**
     * @autor Slav
     * @param h;
     * @return char
     * This method has a char input parameter and return this input parameter
     */
    public static char method_4(char h ) {

        return h ;

    }

    //Problem 5

    /**
     * @autor Slav
     * @param e,f;
     * @return
     * This method has two float input parameters and return one of them
     */
    public static float method_5(float e, float f ){

        return e;

    }

    //Problem 6

    /**
     * @autor Slav
     * @param start;
     * @param finish;
     * @return int
     * Recursia in Range
     */
    public static int sum(int start, int finish) {
        if (finish > start) {
            return finish + sum(start, finish-1);
        } else {
            return finish;
        }
    }
}




