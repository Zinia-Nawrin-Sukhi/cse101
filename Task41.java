import java.util.Scanner;
public class Task41
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please ener anumber");
    int n=sc.nextInt();
    int digc=0;
    while(n>0)
    {
      n=n/10;
      digc++;
    }
    int i=1,pow=1;
    while(i<digc)
    {
      pow=pow*10;
      i++;
    }
    while(pow>0)
    {
      int digit=n/pow;
      System.out.println(digit);
      n=n%pow;
      pow=pow/10;
    }
  }
}