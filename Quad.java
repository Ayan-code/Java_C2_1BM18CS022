import java.util.*;
class Quad
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter values of a,b,c");
  int a=sc.nextInt();
  int b=sc.nextInt(); 
  int c=sc.nextInt();
  int d=b*b-(4*a*c);
  if(d>=0)
  {
    double r1=(-b+Math.sqrt(d))/(2*a);
    double r2=(-b-Math.sqrt(d))/(2*a);
    System.out.println("Roots are:"+r1+"and"+r2);
  }
  else
    System.out.println("Roots are not real"); 
 }
}  
