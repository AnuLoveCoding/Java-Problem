import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter Your Fruit Name : ");
        String fruit = scn.nextLine();

        switch (fruit) { //advance swirch-case use (->) not use of break;//
            case "mango"-> System.out.println("king of fruit");
                
            case "gauava" -> System.out.println("Very Tasty");
                
            case "grapes" -> System.out.println("very tasty fruit");
                 
            case "pine-apple" -> System.out.println("pine-apple");
                
            case "apple" -> System.out.println("Apple");
                
            default-> System.out.println("Wrong Input");
                
        }
    }
}
