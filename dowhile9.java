//to display the sum of n terms of even natural numbers
  import java.util.Scanner;
class dowhile9
  {
    public static void main(String args[])
    {
      int n,i=1,sum=0;
      System.out.println("enter the n value");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      do
      {
        if(i%2==0)
        {
          sum=sum+i;
        }
        i++;
      }while(i<=n*2);
    System.out.println(sum);
    }
  }
