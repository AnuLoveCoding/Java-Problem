import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional_Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /* Multidimensional Array
         *  1 2 3
         *  4 5 6
         *  7 8 9
         * 
            //  * Syntax of  Array;

         int [][] arr = new int [3][3];
         */

        //  int [][] arr = new  int [3][3];

        int [][] arr = new int [3][3];

        // int [][] arr = {

        //    {1,2,3},

        //    {4,5},

        //    {6,7,8,9}
        // };

        // Taking Input :
        System.out.println("Enter Your Number");
       for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scn.nextInt();
            }
       }
         //    giving Output:

            //    for (int row = 0; row < arr.length; row++) {
            //         for (int col = 0; col < arr[row].length; col++) {
                        
            //            System.out.print(arr[row][col]+" ");
            //         }
            //        ;

                    // System.out.println();
                    
            //    }
                // another way to write output;
    for (int row = 0; row < arr.length; row++) {
        System.out.println(Arrays.toString(arr[row]));
    }


    }
}
