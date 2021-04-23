import java.util.Scanner;
public class Task14
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
   double n= sc.nextInt();
    int i=1;double sum=0;
    while(i<=n){
      sum=sum+(i*i);
    i++;
    }
    double y=Math.sqrt(sum);
      System.out.println(y);
  }
}