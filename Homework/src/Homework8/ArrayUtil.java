import java.util.Scanner;

public class ArrayUtil {

    public static void main(String[] args) {


        /**
         * Problem 1
         * author Slav
         * Write a method that prints the positive elements of an int[] n array:
         */


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array size");
//        int size = sc.nextInt();
//        int[] arr1 = new int[size];
//
//

//        for (int i = 0; i < size; i++) {
//            arr1[i] = sc.nextInt();
//        }
//
//
//        for (int i = 0; i < size; i++) {
//            if (arr1[i] >= 0) {
//                System.out.println(arr1[i]);
//            }
//        }


        /**
         * Problem 2
         * author Slav
         * Write a method that prints the elements of the short[] s array in reverse order
         */

//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array size");
//        int size = sc.nextInt();
//        short[] arr1 = new short[size];
//
//        for(int i = 0; i < size; i ++){
//            arr1[i] = sc.nextShort();
//        }
//
//        for(int i = 0; i < size/2; i++){
//            short temp = arr1[i];
//            arr1[i]= arr1[size-i-1];
//            arr1[size-i-1]= temp;
//
//        }
//        for (int i = 0; i < size; i++){
//            System.out.println(arr1[i]);
//        }
//

        /**
         * Problem 3
         * Author Slav
         * Write a method that finds and prints the largest element of the long[] l array:
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array size");
//        int size = sc.nextInt();
//        long[] arr1 = new long[size];
//
//        for(int i = 0 ; i < size; i ++){
//
//            arr1[i] = sc.nextLong();
//        }
//
//        long max = arr1[0];
//        for (int i = 0; i < size-1; i++){
//            if (max < arr1[i+1])
//            {
//                max = arr1[i+1];
//            }
//
//        }
//        System.out.println(max);


        /**
         * Problem 4
         * Author Slav
         * Write a method that finds and prints the smallest element of the float[] f array:
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array size");
//        int size = sc.nextInt();
//        float[] arr1 = new float[size];
//
//        for(int i = 0; i < size; i++){
//            arr1[i] = sc.nextFloat();
//        }
//
//        float min = arr1[0];
//        for(int i = 0; i < size - 1; i++){
//            if(min > arr1[i + 1]){
//                min = arr1[i + 1];
//            }
//
//        }
//        System.out.println(min);


        /**
         * Problem 5
         * author Slav
         * Write a method that moves the elements of the int[] n array into the int[] m array.
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array size");
//        int size = sc.nextInt();
//        int[] n = new int[size];
//        int[] m = new int[size];
//
//
//        for (int i = 0; i < size; i++) {
//            n[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < size; i++) {
//            m[i] = n[i];
//        }
//
//        for (int i = 0; i < size;i++){
//            System.out.println(m[i]);
//        }
        /**
         * Problem 6
         * author Slav
         * Write a method that creates two arrays of the same size and adds them to the array
         * corresponding elements and writes in the third array.
         */
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the array size");
//        int size = sc.nextInt();;
//        int [] arr1 = new int[size];
//        int [] arr2 = new int [size];
//        int [] arr_sum = new int [size];
//
//        System.out.println("Enter the arr1 elements");
//        for (int i = 0; i < size;i++ )
//        {
//            arr1[i] = sc.nextInt();
//        }
//
//        System.out.println("Enter the arr2 elements");
//        for (int i = 0; i < size;i++ )
//        {
//            arr2[i] = sc.nextInt();
//        }
//        System.out.println("sum of  elements");
//        for (int i = 0; i < size; i++ )
//        {
//            arr_sum[i] = arr1[i]+arr2[i];
//        }
//
//        for (int i = 0; i < size; i++ )
//        {
//            System.out.println(arr_sum[i]);
//        }


        /**
         *Problem 7
         * author Slav
         Write a method that counts how many times the number k has met the elements of the array
         in.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the k");
        int k = sc.nextInt();
        ;
        int count = 0;

        System.out.println("Enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {

            if (arr[i] == k) {
                count++;
            }

        }
        System.out.println("count = "+ count);



    }


}





