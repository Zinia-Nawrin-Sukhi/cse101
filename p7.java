import java.util.Scanner;
public class Q7
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
   
    int i=1,sum=0;
    while(i<=3){
        System.out.println("please enter a number");
  int n=sc.nextInt();
  sum=sum+n;
      i++;


    }
    System.out.println(sum);


  }
}