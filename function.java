import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        sum();

    }
    //  Q. sum the two numbers;
    static void sum(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number 1 ");
        int num1 = scn.nextInt();
        System.out.println("Enetr  Number 2 ");
        int num2 = scn.nextInt();
        System.out.println("Sum of two number ");
        int sum = num1 + num2 ;
        System.out.println(" Sum is "+sum);
    }
    
}
