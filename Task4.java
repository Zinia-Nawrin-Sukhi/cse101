import java.util.Scanner;
public class Task4
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int i=1; int sum=0;
    while(i<=5)
    {
      System.out.println("please enter a number");
      int num=sc.nextInt();
      sum=sum+num;
      i++;
    }
    int avg=sum/5;
    System.out.println(avg);
  }
}