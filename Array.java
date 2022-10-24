import java.io.ObjectInputFilter.FilterInfo;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // int[] arr =  new int[5];
        // // int[] arr = 
        // System.out.print(arr[0]+" ");
        // System.out.print(arr[1]+" ");
        // System.out.print(arr[2]+" ");
        // System.out.print(arr[3]+" ");
        // System.out.print(arr[4]+" ");
        // System.out.print(arr[5]+" ");


        //  Q. 1
        // int [] arr = new int [5];

        // // System.out.println(arr[6]);
        // System.out.println("Enter Your Number : ");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = scn.nextInt();
           
        // }

        // System.out.println(Arrays.toString(arr));

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+"-");
           
        // }

        //Q .2 

        String[] arr = new String[6];

        System.out.println("Enter Your Input");

      for (int i = 0; i < arr.length; i++) {
         arr[i] = scn.next();
      }
      
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i]+"-"); // this statement for print the value arr[i];
          }

      System.out.println();
      System.out.println(Arrays.toString(arr)); // this statement for print array;


    }
}
