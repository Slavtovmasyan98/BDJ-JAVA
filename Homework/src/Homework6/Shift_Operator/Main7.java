package Homework6.Shift_Operator;

public class Main7 {
    public static void main(String[] args) {
        /**
         * author Slav
         *
         */
        System.out.println(10 << 2);
        System.out.println(-10 << 2);
        System.out.println(20 >> 1);
        System.out.println(15 >> 3);


        /**
         * author Slav
         * Տրված փոփոխականը բազմապատկեք 8-ով
         */
        System.out.println(10 << 2 << 3);
        System.out.println(-10 << 2 << 3);
        System.out.println(20 >> 1 << 3);
        System.out.println(15 >> 3 << 3);


        /**
         * author Slav
         * Տրված փոփոխականը բազմապատկեք 16-ով
         */
        System.out.println(10 << 2 << 4);
        System.out.println(-10 << 2 << 4);
        System.out.println(20 >> 1 << 4);
        System.out.println(15 >> 3 << 4);


    }
}
