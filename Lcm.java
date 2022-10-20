import java.util.Scanner;

/**
 * Lcm
 */
import java.util.*;
public class Lcm {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter Your First Input:");
        int A = scn.nextInt();
        System.out.println("Enter Your Second Input:");
        int B = scn.nextInt(),  h1=0 ,Lcm =0;
       

        for(int i=1;i<=A || i<= B; i++){
            if(A%i==0 && B%i==0){
                h1 = i;
            }
        }
 
        Lcm =(A*B)/h1;
        System.out.println("Lcm of A and B :");
        System.out.println(Lcm);

    }
}