//factorail of a number
import java.util.Scanner;
class whileloop8
  {
    public static void main(String args[])
    {
      int n,fact=1;
      System.out.println("enter the value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(n>0)
        {
          fact=fact*n;
          n--;
        }
      System.out.println("the factorial of a number is "+fact);
    }
  }