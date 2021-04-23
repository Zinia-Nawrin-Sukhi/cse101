import java.util.Scanner;
public class Task10
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int i=1; 
    System.out.println("please enter nameof your favourite car ");
      String car=sc.next();
      System.out.println("please enter a number");
      int num=sc.nextInt();
      
    while(i<=num)
    {
      System.out.println(car);
      
      i++;
    }
   
  }
}