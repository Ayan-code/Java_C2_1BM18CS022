import java.util.*;

public class Main

{

 public static void main(String[] args)
  {
	  
    Scanner sc=new Scanner(System.in);

    Point p1=new Point();
  
  System.out.println("Enter the x and y coordinates:");

    int x=sc.nextInt();
 
    int y=sc.nextInt();
  
  Point p2=new Point(x,y);
  
  Point p3=new Point(p2);

    Point p4=new Point(7,9);

    p4.dist(p4,p2);
  
    p3.dist(p2,p1);
  }

}

class Point

{

  int x,y;

  double dist;
 

  Point()
  {
   x=0;
   y=0;
  }

  Point(int i,int j)

  {
   x=i;
 
      y=j;

  }

  Point(Point ob)
  
  {
   x=ob.x;

      y=ob.y;

  }

  void dist(Point ob1,Point ob2)

  {

   dist=Math.sqrt(Math.pow((ob1.x-ob2.x),2)+Math.pow((ob1.y-ob2.y),2));

   System.out.println("The distance b/w the points is:"+dist);
  
  }

}