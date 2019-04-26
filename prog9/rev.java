package prog9;

import java.util.Scanner;

public class rev {

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            String s;
            System.out.println("enter the string");
            s = sc.nextLine();
            String ss = "";
            int i;
            for (i = s.length() - 1; i >= 0; i--) {
                ss = ss + s.charAt(i);
            }
            System.out.println("reversed string = " + ss);
        }
    }
}

