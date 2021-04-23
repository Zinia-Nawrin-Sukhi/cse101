public class Task32
{
  public static void main(String[]args)
  {
    int i=1;int sum=0;
    while(i<=300)
    {
     if(i/7==0 && i/9==0)
     {
       sum=sum+i;
      
     }
     
     i++  ;
     
    }
    System.out.println(i);
  }
  
}