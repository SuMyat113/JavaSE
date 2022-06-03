package With_IDE;

import java.util.*;
public class CaseStatement {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();

        switch (a){
            case 1: a=1;break;
            case 2: a=2;break;
            case 3: a=3;break;
            case 4: a=4;break;
            case 5: a=5;break;

        }
        System.out.println("You Enter Number " +a);
    }
}
