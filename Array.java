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


        int [] arr = new int [5];

        // System.out.println(arr[6]);
        System.out.println("Enter Your Number : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
           
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"@");
           
        }
    }
}
