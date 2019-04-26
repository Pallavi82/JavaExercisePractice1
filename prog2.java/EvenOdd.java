package prog2.java;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args){

        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num>=20 && num<=30) {
            if (num % 2 == 1)
                System.out.println("Tom");
            else
                System.out.println("Jerry");
        } else
                System.out.println("Number not between 20 and 30");
        }

        }
