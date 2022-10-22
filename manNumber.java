import java.util.Scanner;

public class manNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // System.out.print("Enter First Number : ");
        // int A = scn.nextInt();
        // System.out.print("Enter Second Number : ");
        // int B = scn.nextInt(); 
        // System.out.print("Enter Third Number : ");
        // int C = scn.nextInt();


        // int max = Math.max(C , Math.max(A, B));
        // System.out.print("Maxmimum Value of "+max);


        // count the the number given ; 

        int n = 12334;

        int count = 0;

        for(int i = 1;n>=i;n/=10){
            int rem = n%10;

            if(rem==1){
                count++;
            }
        }

        System.out.println(count);
    }
}
