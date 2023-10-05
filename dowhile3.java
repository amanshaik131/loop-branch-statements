// to display n terms of natural numbers and their sum.
import java.util.Scanner;
class dowhile3
  {
    public static void main(String args[])
    {
      int sum=0,n,i=1;
      System.out.println("enter the value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      do
      {
       System.out.println(i);
        sum=sum+i;
        i++;
      }while(i<=n);
      System.out.println(sum);
    }
  }