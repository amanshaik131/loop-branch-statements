// to display n terms of natural numbers and their sum.
import java.util.Scanner;
class whileloop3
  {
    public static void main(String args[])
    {
       int i=1, n,sum=0;
      System.out.println("enter the value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<=n)
        {
          sum=sum+i;
          i++;
        }
      System.out.println("the sum is "+sum);
    }
  }