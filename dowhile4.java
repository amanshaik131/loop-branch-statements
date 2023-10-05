//to display the cube of the number up to an integer.
import java.util.Scanner;
class dowhile4
  {
    public static void main(String args[])
    {
      int n,i=1;
      System.out.println("enter the value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      do
        {
          System.out.println(i*i*i);
          i++;
        }while(i<=n);
    }
  }