import java.util.Scanner;
public class palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int temp=num;
        int sum=0;
        int sum1=0;
        while(num>0)
        {
            int r=num%10;
            sum=(sum*10)+r;
            num=num/10;
            if(r%2==0)
                sum1=sum1+r;
        }
        if (temp==sum)
        {
            System.out.println("Number is Palindrome");
            {
                if (sum1 >= 25) {
                    System.out.println("The sum is greater than 25. Sum is :" + sum1);
                } else
                    System.out.println("The sum is lower than 25. Sum is :" + sum1);
            }
        }
        else
        {
            System.out.println("Number is Not Palindrome");
        }
    }
}