import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);

     /*Q. Electricity-Bill
      * Instruction are given on Electricity bill that:
       1. for first 50 Unit Rs 0.50/Unit;
       2. for next 100 Unit rs 0.75/unit;
       3. for next 100 Unit Rs 1.20/Unit;
       4. for above 250 Unit Rs 1.50/Unit;
       An additional Surcharge of 20% is added to the bill;

      */

      System.out.println("Enter Your Bill");
      float  N = scn.nextFloat();

      double bill = 0;

      if(N<=50){
         bill = (N * 0.50);
      }else if( N<=150){
        bill = 50*.50 +(N -50)*.75;
      }else if( N<=250){
        bill = 50*.50+100*.75+(N -150)+1.20;
      }else if(N>250){
        bill = 50*.50+100*.75+100*1.20+(N-250)*1.50;
      }else{

      }

       bill = bill + 0.20* bill;

       int ans = (int)bill;
       System.out.println(ans);

        
        
    }
}
