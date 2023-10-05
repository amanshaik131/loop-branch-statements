//multiplication table

import java.util.Scanner;
class whileloop6
  {
    public static void main(String args[])
    {
      int n,i=1;
      System.out.println("enter the value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<=10)
        {
          System.out.printf("%d * %d =%d\n",n,i,n*i);
            i++;
        }
    
    }
  }