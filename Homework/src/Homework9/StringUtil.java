import java.util.Arrays;
import java.util.Scanner;

public class StringUtil {
    public static void main(String[] args) {

        /**
         * Problem 1
         * Write a method that performs String concatenation with the given parameter:
         */
//        String a = "hello";
//        String b = "world";
//        int c = 1;
//        int d = 2;
//        String f = "1";
//
//        String result = a.concat(" ").concat(b);
//        String result2 = c + d + a;
//        String result3 = f + d + a;
//        String result4 = a + c + d + b;
//        System.out.println(result);
//        System.out.println(result2);
//        System.out.println(result3);
//        System.out.println(result4);

        /**
         * Problem 1
         * Write a method that performs StringBuilder with the given parameter:
         */

//        StringBuilder sb = new StringBuilder();
//        sb.append(a).append(b);
//        System.out.println("sb" + "=" + sb);
//
//
//        StringBuilder sb1 = new StringBuilder();
//        sb1.append(c).append(d).append(a);
//        System.out.println("sb1" + "=" + sb1);
//
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append(f).append(d).append(a);
//        System.out.println("sb2" + "=" + sb2);
//
//
//        StringBuilder sb3 = new StringBuilder();
//        sb3.append(a).append(c).append(d).append(b);
//        System.out.println("sb3" + "=" + sb3);


        /**
         * author Slav
         * Write a method that takes a String parameter and prints each empty character using a new line
         * String Literal ( \t, \b ....):
         */
//        Scanner sc = new Scanner(System.in);
//        String text = sc.nextLine();
//        System.out.println(text.replace(' ', '\n'));


    /**
     * Problem 3
     * author Slav
     * Reverse String
     * Method 1 Reverse String
     * Method 2 Reverse Method 1
     */
    // Method 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string");
//        StringBuilder sb = new StringBuilder(sc.nextLine());
//
//       System.out.println("Method1"+ "="+ sb.reverse());
//
//        //Method 2
//
//        StringBuilder res = new StringBuilder();
//        for(int i = sb.length()-1; i >= 0; i-- ){
//
//            res.append(sb.charAt(i));
//        }
//        System.out.println("Method2"+ "="+ res);


    /**
     * Problem 4
     * Write a method that checks how many times a token is found in the given text
     * the substring.
     */

        //System.out.println(strContain("we are leaving ", "e"));



        /**
         * Problem 5
         * Write a method that capitalizes text using String.
         */
    //Method 1
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Enter the String");
//        String str = sc.nextLine();
//        System.out.println("Method 1" + " = " + str.toUpperCase());
//
//        //Method 2
//        System.out.println("Enter the Second String");
//        StringBuilder sb = new StringBuilder(sc.nextLine());
//        System.out.println("Method 2" + " = " + sb.toString().toUpperCase());
//
//        }

    /**
     * Problem 6
     * Write a method that reads a string of 20 characters from the console, prints it if the string
     * the length is less than 20, then we must silence the line by writing the symbol "*" instead of less symbols.
     */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string");
//        StringBuilder input = new StringBuilder(sc.nextLine());
//        StringBuilder text = new StringBuilder();
//
//        int maxSize = 20;
//
//        for (int i = 0; (i < maxSize); i++) {
//            if ((i < input.length())) {
//                text.append(input.charAt(i));
//            } else {
//                text.append('*');
//            }
//
//        }
//        System.out.println(text.toString());


    /**
     * Problem 7
     *Write a method that removes all "a" characters from the given text. Same problem solve with StringBuilder too
     */
    //Method 1

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string");
//        String text = sc.nextLine();
//        String newText = " ";
//        for(int i = 0 ; i < text.length(); i++ ){
//            if (text.charAt(i)== 'a'){
//                newText = text.replace('a',' ' );
//
//            }
//        }
//        System.out.println(newText);
//    }

    //Method 2
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string");
//        StringBuilder sb = new StringBuilder(sc.nextLine());
//        StringBuilder sb1 = new StringBuilder("");
//
//        for (int i = 0; i < sb.length(); i++) {
//            if (sb.charAt(i) == 'a') {
//                sb1 = sb.deleteCharAt(i);
//            }
//        }
//        System.out.println(sb1);


    /**
     * Problem 8
     *Write a method that replaces all "a" symbols in the given text with "*" using String.
     */
//    Scanner sc = new Scanner(System.in);
//    String text = sc.nextLine();
//    String newText = " ";
//        for(int i = 0 ; i < text.length(); i++ ){
//        if (text.charAt(i)== 'a'){
//            newText = text.replace('a','*' );
//
//        }
//
//
//    }
//        System.out.println(newText);
//}


    /**
     * Problem 9
     *
     */

    //{We ,are, living ,in ,an ,yellow ,submarine, We ,dont, have, anything}

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter String");
//        String sb = sc.nextLine();
//        String[] arr = sb.split(" ");
//        int max = 1;
//        String longtext = "";
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i].length() >= max) {
//                max = arr[i].length();
//                longtext = arr[i];
//
//            }
//
//        }
//        System.out.println(max);
//        System.out.println(longtext);


    /**
     * Problem 10
     * We are living in an yellow submarine. We don't have anything
     */

    //firstString("we are the champion","c")


    /**
     * Problem 11
     *
     */
//    subWord("we are living an yellow", 10);
//
//    subWord1(new StringBuilder("We are living"), 5);


    /**
     * Problem 12
     * Write a method that checks if the given String parameter is empty and not null:
     */

//        String c ;
//     System.out.println(isEmpty(c));


    /**
     * Problem 13
     * Write a method that splits the sentence by ',' and finds the longest word:
     */

    //longestWord("We, are, living, in an, yellow, submarine, We don't, have anything");


    }
/**
 * ********************************************** Methods *****************************************************
 */

    /**
     * Problem 4
     * Write a method that checks how many times a token is found in the given text
     * the substring.
     * @param line
     * @param token
     * @return
     */

//    public static int strContain(String line, String token)
//    {
//        String[] line_arr = line.split(" ");
//
//        int count = 0;
//        for (int i = 0; i < line_arr.length; i++) {
//            if (line_arr[i].contains(token)){
//                count++;
//            }
//        }
//
//        return count;
//
//    }


/**
 * Method 10
 * We are living in an yellow submarine. We don't have anything
 * @param a;
 * @param c;
 */
//    public static void firstString(String a, String c) {
//        String[] arr = a.split("");
//        for (int i = 0; i < a.length(); i++) {
//
//            if (arr[i].equals(c)) {
//                System.out.println(i);
//                break;
//            }
//
//        }
//
//    }

    /**
     * Problem 11
     * Write a method that finds and prints the substring from the beginning of the given string up to the nth index.
     * using String.
     */
    //Method 1 String
//    public static void subWord(String c, int n) {
//        for (int i = 0; i < n; i++) {
//            if (n <= c.length()) {
//                System.out.println(c.charAt(i));
//            } else {
//                System.out.println(c);
//
//            }
//
//        }
//
//    }


    // Method 2 Substring
//    public static void subWord1(StringBuilder c, int n) {
//        if (n <= c.length()) {
//            c = new StringBuilder(c.substring(0, n));
//            System.out.println(c.toString());
//        } else
//            System.out.println(c);

//    }

    /**
     * Problem 12
     * Write a method that checks if the given String parameter is empty and not null
     */

//    public static boolean isEmpty(String c) {
//        return c.isEmpty();
// }

    /**
     * Problem 13
     * Write a method that splits the sentence by ',' and finds the longest word
     */
//    public static void longestWord(String d) {
//
//        String[] arr = d.split(",");
//
//        int max_length = arr[0].length();
//        String max = "";
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i].length() >= max_length) {
//                max_length = arr[i].length();
//                max = arr[i];
//
//            }
//
//
//        }
//        System.out.println(max);
//    }
}













