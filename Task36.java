import java.util.Scanner;
public class Task36
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter number of courses");
    int n=sc.nextInt();
    int i=1,sum=0,totalcredit=0;
    while(i<=n)
    {
      System.out.println("please enter grade");
      int g=sc.nextInt();
      System.out.println("please enter credit");
      int c=sc.nextInt();
      sum=sum+(g*c);
      totalcredit=c+totalcredit;
      i++;
      
    }
    int cgpa=sum/totalcredit;
    System.out.println(cgpa);
     
      
  }
}