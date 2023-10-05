/*
*****
*****
*****
*****
*****/
import java.util.Scanner;
class forloop1
  {
    public static void main(String args[])
    {
      int i,j,n;
      System.out.println("enter the n value");
      Scanner  sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
        {
          for(j=1;j<=n;j++)
            {
             System.out.print("*"); 
            }
          System.out.println(" ");
        }
    }
  }