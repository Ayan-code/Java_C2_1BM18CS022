
import java.util.*;
class Fibo
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter value of n:");
  int n=sc.nextInt();
  fibonacci(n);
 }
static void fibonacci(int n)
 { 
  int first=0,sec=1,i,p=0;
  for(i=2;i<n;i++)
  {
   p=first+sec;
   first=sec;
   sec=p;
  }
  System.out.println("nth element:"+p); 
 }
}  
