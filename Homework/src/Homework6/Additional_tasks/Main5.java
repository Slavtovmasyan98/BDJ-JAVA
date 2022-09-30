package Homework6.Additional_tasks;

public class Main5 {
    public static void main(String[] args) {
        //Problem 7
        /**
         * author Slav
         * Գտնե և ուղղելլ սխալը․
         */

       /*
        float y = 2.1f;
        */

        /*
        byte x = 5;
        byte y = 10;
        byte z = (byte) (x + y);

         */


        long x = 10;
        int y = 5;
        y = (int) (y * x);

        /**
         *author Slav
         *  Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5 այնուհետև փոփոխականի արժեքները տեղերով
         * փոխել։
         */

//        int q = 10;
//        int w = 5;
//        int e;
//        e = q;
//        q = w;
//        w = e;
//        System.out.println("q = " + q);
//        System.out.println("w = " + w);

        /**
         *author Slav
         *  Փորձեք  խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։
         * փոխել։
         */

        int q = 10;
        int w = 5;

        q = q + w;
        w = q - w;
        q = q - w;


        System.out.println("q = " + q);
        System.out.println("w = " + w);


        /**
         * author Slav
         * Գրել ծրագիր, որը հաշվում է 1-100 թվերի գումարը։ (ցիկլ չoգտագործել)
         * With Recursia
         *  Formular
         */

        // Recursia
        int start;
        int end;
        int result = sum(1, 3);
        System.out.println(result);


    }

    public static int sum(int start, int finish) {
        if (finish > start) {
            return finish + sum(start, finish - 1);
        } else {
            return finish;
        }


    }
}