import java.util.Scanner;

public class nCr {
    // write a function check_prime or not;
    public static boolean check_prime( int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                count++ ;
            }

            if(count>2){
                // n is not prime;
                return false;
            }
        }
        // System.out.println(count);

        if(count==2){
            return true;
        }else{
            return false;
        }
    }

    // write a function for nCr factorial;
    // public static int factorial( int x) {
    //     int fact =1;
    //     for (int i = 1; i <= x; i++) {
    //         fact*=i;
    //     }
    //     return fact;
    // }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.println("Enter Your number");
        int n = scn.nextInt();

        if(check_prime(n)==true){
            System.out.println("Number is prime " + check_prime(n));
        }else{
            System.out.println("Number is not prime " + check_prime(n));
        }
        // System.out.println("Enter Your Number 1");
        // int n = scn.nextInt();
        
        // System.out.println("Enter Your Number 2 ");
        // int r = scn.nextInt();

        // int ans = factorial(n) / (factorial(n-r) *factorial(r));
        //  System.out.println(ans);





    }
}
