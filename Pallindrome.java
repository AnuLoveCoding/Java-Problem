import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter Your Input:");
        int N = scn.nextInt();
        for(int i=1;i<=N;i++){
            int sum =0 ;
            int n = i;
             for(; n>=1;n/=10){
                int rem = n%10;
                sum =(sum*10)+rem;
    
             }
             if(i==sum){
                System.out.println("Yes it is :");
                System.out.println(i+ " Pallindorme");
             }

             
        }

            // Pallindrome raj = new Pallindrome();
            //  System.out.println(raj +" reference location ");
       
    }
}
