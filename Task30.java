import java.util.Scanner;
public class Task30
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int i =1;
 System.out.println("please enter a number");
   int a=sc.nextInt();
 System.out.println(a);
 while(i<=20)
 {
   System.out.println("please enter a number");
   int b=sc.nextInt();
   int c=a+b;
     System.out.println(c);
   a=b;
   b=c;
   i++;
  }
}
}