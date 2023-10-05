//to display the n terms of odd natural numbers and their sum.
import java.util.Scanner;
class dowhile7
  {
    public static void main(String args[])
    {
      int n,i=1,sum=0;
      System.out.println("enter the value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      do
      {
     if(i%2!=0)
     {
       System.out.println(i);
       sum=sum+i;
     }
        
        i++;
      }while(i<=n*2);
      System.out.println(sum);
      }
  }