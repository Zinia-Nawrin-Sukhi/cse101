import java.util.Scanner;
public class Task16
{
  public static void main(String[]args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("please enter value of n");
    int n=sc.nextInt();
    int c=1,sum=0;
   
    while(c<=n)
    {
      c=n/(2*n-1);
      sum=sum+c;
      c++;
    
    }
    System.out.println(sum);
  }
}