import java.util.Scanner;

/**
 * prime
 */
public class prime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.println("Enter Your Number");
        int n = scn.nextInt();

        int ans =0;

        for (int i = 1; i <=n; i++) {
            int count = 0;
            for (int j = 1; j <=i; j++) {
                if(i%j==0){
                    count++;
                }
                if(count>2){
                    break;
                }
            }
            if(count==2){
                ans++;
                System.out.print(ans);
                
            }
        } 
           
           System.out.println();
           System.out.println(ans);
       
    }
}