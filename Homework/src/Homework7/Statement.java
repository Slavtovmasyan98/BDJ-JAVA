package Homework7;

public class Statement {
    public static void main(String[] args) {

        method1(6);
        method2(-7);
        method3(16);
        method4(12);
        method5(576);
        method7(4, 8, -5);
        method8(2200);
    }

    /**
     * author Slav
     * 1․ Գրել method, որը ստուգում է տրված x ամբողջ թիվը զույգ է թե կենտ.
     */
    public static void method1(int x) {
        if (x % 2 == 0) {
            System.out.println(x + "=" + "Zuyg");
        } else
            System.out.println(x + "=" + "Kent");

    }

    /**
     * author Slav
     * 2․ Գրել method, որը ստուգում է տրված x ամբողջ թիվը դրական է թե բացասական.
     */
    public static void method2(int x) {
        if (x >= 0) {
            System.out.println(x + "=" + "Drakan");

        } else
            System.out.println(x + "=" + "Bacasakan");

    }

    /**
     * author Slav
     * 3․ Գրել method, որը ստուգում է տրված x ամբողջ թիվը ՝ կամ փոքր 8 ից և մեծ 5 ից
     * Կամ փոքր 20 ից և մեծ 15 ից
     */
    public static void method3(int x) {
        if ((x > 5 && x < 8) || (x > 15 && x < 20)) {
            System.out.println("True");

        } else
            System.out.println("False");

    }

    /**
     * author Slav
     * 4.Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա
     * առանց մնացորդի.
     */

    public static void method4(int x) {
        if ((x % 5 == 0) && (x % 7 == 0)) {
            System.out.println("True");
        } else
            System.out.println("False");
    }

    /**
     * author Slav
     * 5․ Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։
     */

    public static void method5(int x) {
        if ((x < 100 || x > 999)) {
            System.out.println("Error");
        } else {
            int a;
            int b;
            int c;

            //First Digit
            a = x / 100;

            //Second Digit
            b = x / 10;
            b = b % 10;

            //Last Digit
            c = x % 10;

            if (b == 7) {
                System.out.println("True");
            } else
                System.out.println("False");

        }

    }

    /**
     * author Slav
     * 6.Գրել method, որը ստուգում է (x,y) կորդինատներով կետը գտնվում է արդյոք K(0,5)
     * շրջանի մեջ թե ոչ։
     */

        public static  void method6(int x ,int y){
            if (x>= 0 && x<=5) &&(y)
        }


    /**
     * author Slav
     * 7.Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։
     */
    public static void method7(int x, int y, int z) {
        int max = x;
        if ((x >= y && x >= z)) {
            max = x;


        } else if ((y >= x) && (y >= z)) {
            max = y;

        } else {
            max = z;
        }

        System.out.println(max);


    }
    /**
     * author Slav
     * 8.Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։ (նահանջ
     * է համարվում այն տարին որը բաժանվում է 4 և 400 բայց միևնույն ժամանակ չի
     * բաժանվում 100-ի)
     */
    public static void method8(int x){
        if((x % 4 ==0 && x % 100 != 0) || x % 400 ==0){
            System.out.println("leap year");
        }
        else {
            System.out.println("Not Leap year");
        }
    }



}
