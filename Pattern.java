import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

import javax.sound.midi.Soundbank;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        // System.out.println("Enter Your Number :");
        // int n = scn.nextInt();

        // int space = n-1;
        // int star = 1;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=space;j++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1;j<=star;j++){
        //         System.out.print("*\t");
        //     }
        //     space--;
        //     star++;
        //     System.out.println();
        // }

        // int space = 0 ;
        // int star = n;
        // for(int i=1;i<=n;i++){
        //    for(int j=1;j<=space;j++){
        //       System.out.print("\t");
        //    }
        //         for(int j=1;j<=star;j++){
        //             System.out.print("*\t");
        //         }

        //     space++;
        //     star--;
        //     System.out.println();
        // }


        // print the stair;

        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        // }

        // print the reverse stair;

        // for(int i = 5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*\t");

        //     }
        //     System.out.println();
        // }

        // print the stair of  even digit of star;

        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if(j%2==0){
        //             System.out.print(j+"\t");
        //         }else{
        //             System.out.print("*\t");
        //         }
                
        //     }
        //     System.out.println();
        // }

        // print the stair of  odd digit of star;


        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         if(j%2!=0){
        //             System.out.print(j+"\t");
        //         }else{
        //             System.out.print("*\t");
        //         }
        //     }
        //     System.out.println();
        // }
       
        // int n =5;
        // int space
    
        // int  N = 5;
        // int space = N /2;
        // int star = 1;

        // for(int i=1;i<=N;i++){
        //     for(int j=1;j<=space;j++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1;j<=star;j++){
        //         System.out.print("*\t");
        //     }

        //     if(i<=N/2){
        //         space--;
        //         star+=2;
        //     }else{
        //         space++;
        //         star-=2;
        //     }
        //     System.out.println();
        // }


        // int n = 3 ;
        // int star = n/2+1 ,space = 1;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=star;j++){
        //         System.out.print("*\t");
        //     }
        //     for(int j=1;j<=space;j++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1;j<=star;j++){
        //         System.out.print("*\t");
        //     }
        //     if(i<=n/2){
        //         star--;
        //         space+=2;
        //     }else{
        //         star++;
        //         space-=2;
        //     }
        //     System.out.println();
        // }

        // int n = 5;

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(i==j){

        //             System.out.print("*\t");
        //         }else{
        //             System.out.print("\t");
        //         }
               
        //     }
        //     System.out.println();
        // }



        // int n = 5;

        // for (int i = n; i>=1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         if( i==j){
        //             System.out.print("*\t");
        //         }else{
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if( i== j || i+j == n+1){
        //             System.out.print("*\t");
        //         }else{
        //             System.out.print("\t");
        //         }
        //     }
        //     System.out.println();
        // }
         

        // int n = 5;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n = 5;
        // for (int i = n; i>=1; i--) {
        //     for (int j = 0; j <=i; j++) {
        //         System.out.print("");
        //     }
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // for (int i = n; i>=1; i--) {
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print(" ");
                
        //     }for (int j = 1; j<= i; j++) {
        //         System.out.print("*");
                
        //     }
        //     System.out.println();
        // }

        // int n = 5;

        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=n-i+1; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j <= 2*(i-1); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= n-i+1; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();

        // }

        // for (int i = 1; i <=n ; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     for (int j = 1; j <= 2*(n-i); j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }




        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
            
        }
        for (int i = n; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }







    }
}
