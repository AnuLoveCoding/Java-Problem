import java.util.Arrays;
import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        // sum();
        // String name = "Anurag";
        // greet(name);

        int[] arr = {5,2,3,5,6,4,7,8};
        
        change(arr);
        System.out.println(Arrays.toString(arr));

        

    }

    // static void greet(String naam){
    //     System.out.println("Hello " + naam);
    // }


    static void change(int[] nums){
        nums[0] =99;
        nums[3] =77;
        
    }

    //  Q. sum the two numbers;
    // static void sum(){
    //     Scanner scn = new Scanner(System.in);
    //     System.out.println("Enter Number 1 ");
    //     int num1 = scn.nextInt();
    //     System.out.println("Enetr  Number 2 ");
    //     int num2 = scn.nextInt();
    //     System.out.println("Sum of two number ");
    //     int sum = num1 + num2 ;
    //     System.out.println(" Sum is "+sum);
    // }
    
}
