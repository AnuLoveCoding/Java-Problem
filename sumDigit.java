import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // find the sum of given digit;

        System.out.println("Enter Your Input Number:");
        long N = scn.nextLong();
        long sum =0;
        System.out.println();
        if(N==0){
            // System.out.println(0);
        }else if(N<0){
            N = -N;
        }for(int i=1;N>=i;N/=10){
            Long rem = N%10L;
            
            System.out.print(rem);
            sum+=rem;
        }
        System.out.println("(rem)");
        System.out.println();
        System.out.println("Input Result " +sum);
       
    }

}
