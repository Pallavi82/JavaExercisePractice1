package prog7;
import java.util.*;
public class des {
    public static void main(String[] args)
    {
         Scanner sc= new Scanner (System.in);
         System.out.println("enter the size of the array");
         int n=sc.nextInt();
         int a[]= new int[n];
         int i, sum=0,j,t=0;
         for(i=0;i<n;i++)
         {
             System.out.println("enter the elements");
             a[i]=sc.nextInt();
         }
         for(i=0;i<=(n-1);i++)
         {
             for(j=1;j<(n-1);j++)
             {
                 if(a[j]<=a[j+1])
                 {
                     t=a[j];
                     a[j]=a[j+1];
                     a[j+1]=t;
                 }
             }
         }
         for(i=0;i<n;i++)
         {
             if(a[i]%2==0)
             {
                 sum=sum+a[i];
             }
         }
         if(sum>=15)
             System.out.println("true");
         else
             System.out.println("false");

    }
}
