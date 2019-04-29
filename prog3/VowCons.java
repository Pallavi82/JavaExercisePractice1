package prog3;

import java.util.Scanner;

public class VowCons {

    public static void main(String[] args) {

        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i<str.length(); i++){

            char r = str.charAt(i);
            if(r == 'a'||r == 'e'||r == 'i'||r == 'o'||r == 'u')
            {
                System.out.println("Vowel is : " +r);
            }
            else {
                System.out.println("Consonant is : " +r);
            }

        }

    }
}
