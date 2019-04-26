package prog5;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        System.out.println("Specify the set of numbers ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the Numbers");
        for (int i = 0; i<num; i++) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            if (n > 0) {
                sum = sum + n;
            } else {
                System.out.println("Error message - non integer entered");
            }
        }
        System.out.println("Total sum of numbers is :" + sum);
    }
}