import java.util.Scanner;

public class Arrayprblm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // take 5 values and store them in array;
        int []arr = new int[5];

        // scan values in array;
        for (int i = 0; i < 5; i++) {
            arr[i] = scn.nextInt();
        }

        //print the array
        for (int i = 0; i < 5; i++) {
            // System.out.println(arr[i]);
            System.out.println("arr["+i+"]=" +arr[i]);
        }

    }
}
