import java.util.Arrays;

public class shadowing {
//    static  int x = 90;
    public static void main(String[] args) {
        // System.out.println(x);
        // int x = 40;
        // System.out.println(x);

        num(2,3,4,5,6,7,8,9,5,4,5,4);
    }

    static void num(int...v){
        System.out.println(Arrays.toString(v));
    }
}
