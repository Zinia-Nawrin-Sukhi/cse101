import java.util.Scanner;
public class Task31
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
  
    System.out.println("please enter your mark");
    int m1=sc.nextInt();
    int i=1,sum=0,max=m1,min=m1;
  
    while(i<10)
    {
      System.out.println("please enter your mark");
      int m2= sc.nextInt();
      if(m2>max)
      {
        m2=max;
      }
      else
      {
        if(m2<min)
        {
          min=m2;
        }
      }
      sum=sum+m1+m2;
      i++;
    }
    
    int avg=sum/10;
    System.out.println(max);
    System.out.println(avg);
    System.out.println(min);
    
  }
}