import java.util.Scanner;
public class Task6
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int i=1; int sum=0;
    while(i<=20)
    {
      System.out.println("please enter a number");
      int num=sc.nextInt();
      sum=sum+num;
      i++;
    }
    int avg=sum/20;
    System.out.println(avg);
  }
}