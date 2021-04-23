import java.util.Scanner;
public class Task33
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int a=0,b=1;
    System.out.print(a);
 System.out.print(b);
int i=1;
  
 while(i<1600)
 {
   
   int c=a+b;
     System.out.println(c);
   a=b;
   b=c;
   i++;
  }
}
}