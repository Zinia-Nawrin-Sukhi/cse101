import java.util.Scanner;
public class Task22
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    
    int i=1,sum=0,nc=0;
    while(i<=10)
    {
      System.out.println("please enter a number");
    int n=sc.nextInt();
    if(n%2==0)
    {
    }
    else{
   
      sum=sum+n;
      nc++;
        
      
    }
    i++;
    }
    int avg=sum/nc;
    System.out.println(sum);
    System.out.println(avg);
  }
}
