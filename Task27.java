public class Task27
{
  public static void main(String[]args)
  {
    int i=10,sum=0;
    while(i<=60)
    {
      if(i%2==0)
      {
       sum=sum+i;
      }
      
      i++;
     
    }
     System.out.println(sum);
  }
}