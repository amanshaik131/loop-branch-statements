//to display the cube of the number up to an integer.
import java.util.Scanner;
class whileloop4
  {
    public static void main(String args[])
    {
      int n;
      System.out.println("enter the value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.printf("the cube of  is  %d =%d" ,n,n*n*n);
    }
  }