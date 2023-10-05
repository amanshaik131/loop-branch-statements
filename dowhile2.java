//sum of first 10 natural numbers
class dowhile2
  {
    public static void main(String args[])
    {
      int i=1,sum=0;
      do
      {
sum=sum+i;
        i++;
      }while(i<=10);
      System.out.println(sum);
    }
  }