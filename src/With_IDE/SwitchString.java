package With_IDE;

import java.util.*;
public class SwitchString {
    public static void main(String[] args) {
        String str;

        System.out.println("Input Yes or No");
       Scanner sc=new Scanner(System.in);
       str= sc.nextLine();

       switch (str){
           case "Yes":
               System.out.println("You enter yes"); ;break;
           case "No":
               System.out.println("You enter no");;break;
       }
    }
}
