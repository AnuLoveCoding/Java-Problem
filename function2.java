import java.util.Scanner;

public class function2 {
    
    // write a function to multiply three numbers;

    static int multiply(int a, int b,int c){
        return a*b*c;
    }



    // write a function to subtract two numbers;
    // static void sub(int x,int y){
    //      int minus =  x-y;
            // to use void no need to return and print in function and call main function;
    //      System.out.println(minus);
    // }


    // write a function to add two numbers;
    // static int sum(int a , int b){
    //     return a+b ;
        
    // }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

    //   System.out.println(sum(4,5));  

            // sub(5,2);  to data type always only call function.

            System.out.println(multiply(5, 7, 2));



    }
}
