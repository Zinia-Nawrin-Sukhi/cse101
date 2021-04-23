import java .util.Scanner;
public class Task38
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
      System.out.println("please enter a number");
      int n=sc.nextInt();
      int c=1,divcount=0;
      while(c<=n)
      {
      if(n%c==0)
        {
          
            divcount++;
      }
            c++;
      }
                    
      if(divcount==2)
      {
        System.out.println("Prime number");
      }
      else
      {
        System.out.println("not prime number");
        
      }
        }
      }

