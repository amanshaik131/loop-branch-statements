//factorail of a number
import java.util.Scanner;
class dowhile8
  {
    public static void main(String args[])
    {
      int n,fact=1;
      System.out.println("enter the value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
     do
     {
       fact=fact*n;
       n--;
     }while(n>0);
       System.out.println(fact);
    }
  }