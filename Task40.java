import java.util.Scanner;
public class Task40
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a nuber");
    double a=sc.nextDouble();
    double h=(a-a%500)/500;
    double i=a%500;
    double l=(i-i%100)/100;
    double m=i%100;
    double n=(m-m%50)/50;
    double p=m%50;
    double q=(p-p%20)/20;
    double r=p%20;
    double s=(r-r%10)/10;
    double t=r%10;
    double u=(t-t%5)/5;
    double v=t%5;
    double w=(t-t%2)/2;
    System.out.println("500TK"+h);
    System.out.println("100TK"+l);
    System.out.println("50TK"+n);
    System.out.println("20TK"+q);
    System.out.println("10TK"+s);
    System.out.println("5TK"+u);
    System.out.println("2TK"+w);
    
    
    
    
    
    
    
    
    
  }
}