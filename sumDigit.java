import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // find the sum of given digit;

        // System.out.println("Enter Your Input Number:");
        // long N = scn.nextLong();
        // long sum =0;
        // System.out.println();
        // if(N==0){
        //     // System.out.println(0);
        // }else if(N<0){
        //     N = -N;
        // }for(int i=1;N>=i;N/=10){
        //     Long rem = N%10L;
            
        //     System.out.print(rem);
        //     sum+=rem;
        // }
        // System.out.println("(rem)");
        // System.out.println();
        // System.out.println("Input Result " +sum);

        // find the odd-digit sum and even-digit sum and count also both in a given Number;

        System.out.println("Enter Your Number");
        int N = scn.nextInt();
        int sum_odd = 0, sum_even = 0 , count =0 , count1=0;
        if(N==0){
            // System.out.println(0);
        }
            else if(N<0){
                N = -N;
            }
            System.out.println("N is "+N);
            // for(int i=1;N>=i;N/=10){
            //     int rem = N%10;

            //     if(rem%2==0){

            //         sum_even+=N%10;
            //         count++;

            //     }else if(rem%2!=0){

            //         sum_odd+=N%10;
            //         count1++;
            //     }

            // }
            System.out.println("sum_even is " + sum_even + " (count is) "+ count);
            System.out.println();
            System.out.println("sum_odd is " + sum_odd + " (count1 is) "+ count1);
       




            for(int i=1;N>=i;N/=10){
                int rem = N%10;

                if(rem%2==0){

                    sum_even+=N%10;
                    count++;

                }else if(rem%2!=0){

                    sum_odd+=N%10;
                    count1++;
                }

    
            }



            
    }

}
