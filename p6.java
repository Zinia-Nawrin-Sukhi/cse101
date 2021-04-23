import java.util.Scanner;
public class Q6
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int i=1;
    while(i<=10)
    {
      System.out.println("please enter a number");
      int n=sc.nextInt();
      System.out.println("please enter a number");
      int n1=sc.nextInt();
      if(n==n1)
      {
       System.out.println("please enter a  different number");
      
      }
      else
      {
        System.out.println();
      
      }
      i+=2;
      
    }
  }
}