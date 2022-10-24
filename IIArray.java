import java.util.Arrays;
import java.util.Scanner;

public class IIArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int [] num = {4,5,5,6,54,9,4};

        System.out.println(Arrays.toString(num));


        raj(num);
        System.out.println(Arrays.toString(num));





    }

    static void raj(int[] num){
         num[3] = 99;
    }
}
