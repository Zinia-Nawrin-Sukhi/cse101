import java.util.Scanner;
public class Task15
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("please enter value of n");
    int n=sc.nextInt();
    int c=1,sum=0,pos=1;
   int y= sc.nextInt();
    while(c<=n)
    {
      if(pos%2==0)
      {
        y=sum-(c*c);
      }
      else{
        y=sum+(c*c);
      }
      c++;
      pos++;
    }
    System.out.println(y);
  }
}