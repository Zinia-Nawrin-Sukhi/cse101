import java.util.Scanner;
public class Q3
{
  public static void main(String[]arges)
  {
    Scanner sc=new Scanner(System.in);
    int i=1;
   
    while(i<=9)
    {
      System.out.println("please enter a number");
        int n=sc.nextInt();
      i++;
    }
    System.out.println("please enter a number");
  int n=sc.nextInt();
     System.out.println("please enter a number");
        int n1=sc.nextInt();
     if(n1>=n || n1<=n)
     {
       
      System.out.println("yes"); 
   
     }
     else
     {
       System.out.println("no");
     }
  }
}