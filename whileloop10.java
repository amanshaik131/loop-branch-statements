//displays the n terms of square natural numbers and their sum.
import java.util.Scanner;
class whileloop10
  {
    public static void main(String args[])
    {
      int n,i=1,sum=0;
      System.out.println("enter the vaalue");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<=n)
        {
          System.out.println(i*i);
           i++;
        }
    }
  }