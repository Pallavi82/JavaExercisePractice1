package prog6;

import java.util.Scanner;
import java.util.*;

public class CheckChar {

    public static void main(String[] args) {

        System.out.println("Enter a character ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if( ch>=97 && ch<= 122 )
            System.out.println("Small Letter");

        else
        if( ch>=65 && ch<= 90 )
            System.out.println("Capital Letter");
        else
        if( ch>=48 && ch<= 57 )
            System.out.println("Number");
        else
            System.out.println("Special Character");
    }
}
