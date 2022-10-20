import java.util.Scanner;

/**
 * Armstrong
 */
import java.util.*;
public class Armstrong {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Your Input");
        int N = scn.nextInt();
        for(int i=1;i<=N;i++){

            int sum = 0;
            int n = i;
    
            for(;n>0;n/=10){
                int rem = n%10;
                sum += rem*rem*rem;
            }
    
            if(i==sum){
                System.out.println(i+" Armstorng");
           
        }
       

    }
}
}