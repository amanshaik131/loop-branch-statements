//multiplication table
import java.util.Scanner;
class dowhile6
  {
    public static void main(String args[])
    {
      int n,i=1;
      System.out.println("enter the value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      
        do{
          System.out.println(i*n);
          i++;
        }while(i<=10);
    }
  }