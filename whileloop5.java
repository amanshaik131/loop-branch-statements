//to display the cube of the n number up to an integer.
import java.util.Scanner;
class whileloop5
  {
    public static void main(String args[])
    {
      int n,i=1;
      System.out.println("enter the value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      while(i<=n)
        {
      System.out.printf("the cube of  is  %d =%d\n" ,i,i*i*i);
          i++;
        }
    }
  }