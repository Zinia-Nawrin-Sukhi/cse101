import java.util.Scanner;
public class Task5
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int i=1; 
    while(i<=20)
    {
      System.out.println("please enter a number");
      int num=sc.nextInt();
      if(num%2==0)
      {
       System.out.println("The number is even"); 
      }
      else
      {
        System.out.println("The number is odd");
      }
    
      i++;
    }
    
  }
}