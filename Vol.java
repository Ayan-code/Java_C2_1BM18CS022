import java.util.*;

class TwoD
{
  private int l,b;
  TwoD()
  {
    l=b=0;
  } 
  TwoD(int l,int b)
  {
   this.l=l;
   this.b=b;
  }
  int area()
  {
   return(l*b); 
  }
}
class ThreeD extends TwoD
{
  int h;
  ThreeD()
  {
    super();
    h=0;
  }
  ThreeD(int l,int b,int h)
  {
   super(l,b);
   this.h=h;
  }
  int vol()
    {return (area()*h);}
}

class Vol
{
 public static void main(String args[])
 {
   TwoD ob=new TwoD();
   ThreeD ob1=new ThreeD(3,5,9);
   int t=ob1.vol();
   System.out.println("Volume is:"+t);
 }
} 
    
