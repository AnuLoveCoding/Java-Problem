import java.util.ArrayList;
import java.util.Scanner;

public class arrayListExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();


        list.add(56);
        list.add(23);
        list.add(54);
        list.add(22);
        list.add(81);
        list.add(51);
        list.add(94);
        list.add(66);
        list.add(29);
        list.add(56);
        list.add(23);
        list.add(54);
        list.add(22);
        list.add(81);
       
        System.out.println(list.contains(29));
        System.out.println(list.set(0, 67));

        System.out.println(list);
    }
}
