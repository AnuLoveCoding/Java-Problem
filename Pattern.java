import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);


        System.out.println("Enter Your Number :");
        int n = scn.nextInt();
        // int space = 0 ,star = n;
        // for(int i=1;i<=n;i++){
        //    for(int j=1;j<=space;j++){
        //     System.out.print("\t");
        //    }
        //    for(int j=1;j<=star;j++){
        //     System.out.print("*\t");
        //    }

        //     space++;
        //     star--;
        //     System.out.println();
        // }

        int space = n-1 , star = 0;


        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }

    }
}