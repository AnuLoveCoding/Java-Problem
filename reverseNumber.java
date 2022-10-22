import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = 456123;
        int ans =0;
        for(int i = 0;n>i;n/=10){
            int rem = n%10;
           
           System.out.print(rem+" ");
        }
      
    }
}
