import java.util.*;

class Rectangle
{
 int l,w;
 Scanner sc=new Scanner(System.in);
 void area()
 {
  System.out.println("Enter length:");
  l=sc.nextInt();
  System.out.println("Enter width:");
  w=sc.nextInt();
 }
 void display()
 {
  int area=l*w;
  System.out.println("length is:"+l+" width is:"+w); 
  System.out.println("\n Area:"+area);
 }
}
class Rectvalue
{
 public static void main(String args[])
 { 
  Rectangle R=new Rectangle();
  R.area();
  R.display();
  Rectangle R1=new Rectangle();
  R1.area();
  R1.display();
 }
}
  
   
  
 
