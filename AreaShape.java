import java.util.*;
abstract class Shape
{
  int l;
  int b;
  abstract void printArea();
}

class Rect extends Shape
{
   void printArea()
   {
     System.out.println("Area="+(l*b));
   }
}

class Square extends Shape
{
   void printArea()
   {
     System.out.println("Area="+(l*l)); 
   }
}
 
class Circle extends Shape
{
  void printArea()
  {
    double area=(double)(3.14*l*l);
    System.out.println("Area="+area);
  }
}

class AreaShape
{
  public static void main(String args[])
  {
   int ch=0;
   Scanner sc=new Scanner(System.in);
   Shape ref=null;
   while(ch!=4)
   {
    System.out.println("Enter your choice-> 1.Rectangle 2.Square 3.Circle 4.Exit :");
    ch=sc.nextInt();
    if(ch==1)
    { 
      ref=new Rect();
      System.out.println("Enter length and breadth:");
      ref.l=sc.nextInt();
      ref.b=sc.nextInt();
      ref.printArea();
    }  
    else if(ch==2)
    {
      ref=new Square();
      System.out.println("Enter the length:");
      ref.l=sc.nextInt();
      ref.printArea();
    }
    else if(ch==3)
    {
     ref=new Circle();
     System.out.println("Enter the radius:");
     ref.l=sc.nextInt();
     ref.printArea();
    }
    else
       System.out.println("Wrong Choice!!");
   }
  }
}  
   
   
