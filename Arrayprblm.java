import java.util.Scanner;

public class Arrayprblm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        // Arrayprblm location = new Arrayprblm();
        // System.out.println(location);
        

        // take 5 values and store them in array;
        // int []arr = new int[5];

        // // scan values in array;
        // for (int i = 0; i < 5; i++) {
        //     arr[i] = scn.nextInt();
        // }

        // //print the array
        // for (int i = 0; i < 5; i++) {
        //     // System.out.println(arr[i]);
        //     System.out.println("arr["+i+"]=" +arr[i]);
        // }


        //find the average of numbers
        int n = scn.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < 3; i++) {
            arr[i] = scn.nextInt();
        }

        int sum =0 ,count =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            count++;
        }
        
        int ans = sum/count;
        System.out.println(ans);

    }
}
