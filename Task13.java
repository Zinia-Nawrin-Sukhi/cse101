import java.util.Scanner;
public class Task13
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
  
    System.out.println("please enter a number");
      int n1=sc.nextInt();
    if(n1%2==0)
    {
    int i=1,sum=0;
    int min=n1;
    while(i<=5)
    {
      System.out.println("please enter another number");
      int n2= sc.nextInt();
      if(n2%2==0)
      {
      if(n2<min)
      {
        n2=min;
      }
      }
      i++;
    }
    sum=sum+i;
    int avg=sum/5;
   System.out.println(min);
    System.out.println(avg);
    } 
  }
  }
