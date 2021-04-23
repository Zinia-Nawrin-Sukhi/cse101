import java.util.Scanner;
public class Task28
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter the quantity of numbers");
    int q =sc.nextInt();
    int i=1,p=1;
    while(i<=q)
    {
      System.out.println("please enter a number");
      int n =sc.nextInt();
      p=p*n;
      i++;
    }
    
    System.out.println(p);
  }
}