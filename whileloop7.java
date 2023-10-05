//to display the n terms of odd natural numbers and their sum.
import java.util.Scanner;
class whileloop7
  {
    public static void main(String args[])
    {
       int i=1,sum=0,n;
      System.out.println("enter the value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<=n*2)
        {
            if(i%2!=0)
            {
              sum=sum+i;
              System.out.println(i);
            }
          
          i++;
        }
      System.out.println(sum);
    }
  }