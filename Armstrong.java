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


     // find the armstrong number;
        //  Always remind the Armstrong means  input length ;
        // if input length 3 then power of the input 3;
        // if input length 2 then power of the input 2;
            // System.out.println("Enter Your number");
        // int A = scn.nextInt();
        // int A = 152;
        // int sum = 0;
        // int temp = A;
        // for(;A>0;A/=10){
        //     int rem = A%10;
        //     sum += rem*rem*rem;

        // }
        // System.out.println(sum);
        // System.out.println("************");
        // System.out.println(A);

        // if(sum==temp){
        //     System.out.println("Number is Armstrong");
        // }else{
        //     System.out.println("Number is not Armstrong");
        // }


        //     System.out.println("Enter your number");
        // int  N = scn.nextInt();

        // // for(int i=1;i<=N;i++){
        //     int sum = 0 ;
        //     // int  n=i;
        //     int temp =N;
        //     for(;N>0;N/=10){
        //         int rem = N%10;
        //         sum += rem*rem*rem;
               
        //     }

        //     if(temp==sum){
        //         System.out.println(" Number is Armstrong");
        //     }else{
        //         System.out.println("Number is Not Armstrong");
        //     }
        // 
}
}