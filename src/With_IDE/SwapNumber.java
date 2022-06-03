package With_IDE;

import java.util.*;
public class SwapNumber {
    public static void main(String[] args) {

        int a;
        int b;

        Scanner sc=new Scanner (System.in);

        System.out.println("Enter Two Number");

        a=sc.nextInt();
        b=sc.nextInt();

        a=b;
        b=a;


        System.out.println("Swapping Numbers are" + a + b);

    }
}
