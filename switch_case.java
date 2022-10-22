import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter Your Fruit Name : ");
        String fruit = scn.nextLine();

        switch (fruit) {
            case "mango": System.out.println("king of fruit");
                
                break;
            case "gauava" : System.out.println("Very Tasty");
                break;
            case "grapes" : System.out.println("very tasty fruit");
                 break;
            case "pine-apple" : System.out.println("pine-apple");
                break;
            case "apple" : System.out.println("Apple");
                break;
             default: System.out.println("Wrong Input");
                break;
        }
    }
}
