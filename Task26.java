import java.util.Scanner;
public class Task26
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int n =sc.nextInt();
    int i=1,sum=0;
    while(i<=n)
    {
      if(i%2==0)
      {
      }
      else
      {
       sum=sum+i;        
      }
      i++;
    }
    System.out.println(sum);
  }
}