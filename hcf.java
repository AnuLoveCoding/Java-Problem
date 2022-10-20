
import java.util.*;
public class hcf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your First Input:");
        int A = scn.nextInt();
        System.out.println("Enter Your Second Input:");
        int B = scn.nextInt();
        int h1= 0;
        for(int i=1; i<=A || i<=B ;i++){
            if(A%i==0 && B%i==0){
                h1 = i;
            }
        }
        System.out.println("Hcf of A and B is :");
        System.out.println(h1);
    }
}
