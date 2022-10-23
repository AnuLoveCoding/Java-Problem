import java.util.Arrays;
import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // sum();
        // String name = "Anurag";
        // greet(name);

        // int[] arr = {5,2,3,5,6,4,7,8};
        
        // change(arr);
        // System.out.println(Arrays.toString(arr));

        System.out.println("Enter Your Number 1 ");
        int a = scn.nextInt();
        System.out.println("Enetr Your  Number 2 ");
        int b = scn.nextInt();
        System.out.println("Enter Your  Number 3 ");
        int c = scn.nextInt();

        int multiple = multiple(a, b, c);
        System.out.println("The Multiple of numbers : "+multiple);

    //    int sum =  sumDigit(a,b);
    //    System.out.println(sum);
        

    }


    // find the product of numbres;

    static  int multiple(int a ,int b, int c){
        int product = a*b*c;
        return product;
    }

    //  sum of two digit;
    // static int sumDigit(int a , int b){
    //        int sum  = a + b;
    //     //    System.out.println(sum);
    //        return sum;
    // }

    // static void greet(String naam){
    //     System.out.println("Hello " + naam);
    // }


    // static void change(int[] nums){
    //     nums[0] =99;
    //     nums[3] =77;
        
    // }

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
