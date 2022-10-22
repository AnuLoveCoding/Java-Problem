import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


       int ans = 0;
       while(true){
        System.out.println("Enter the operator : ");

        char op = scn.next().trim().charAt(0);

        if(op == '+'|| op =='-'||op=='*'||op=='/'||op=='%');
        System.out.println("Enter first  Numer ");
        int num1 = scn.nextInt();
        System.out.println("Enter Sevond Number ");
        int num2 = scn.nextInt();

        if(op=='+'){
            ans = num1+num2 ;
        }
        if(op=='-'){
            ans = num1-num2 ;
        }
        if(op=='*'){
            ans = num1*num2 ;
        }
        if(op=='/'){
            ans = num1/num2 ;
        }
        if(op=='%'){
            ans = num1%num2 ;
        }else if( op =='x'|| op=='X'){
            break;
        }


        System.out.println("Ans is "+ ans);
        break;
    }

    }
}
