import java.util.*;
class Vaahan
{
  String model,color;
  int year;
  static int no_of_veh;
  
  Vaahan(String model,String color,int year)
  {
    this.model=model; 
    this.color=color;
    this.year=year;
    no_of_veh++;
  }
  void display()
  {
    System.out.println("Model of car is:"+model);
    System.out.println("Color of car is:"+color);
    System.out.println("Launched year of car is:"+year);
    dis();
  }
  static void dis()
  {
   System.out.println("Total number of cars:"+no_of_veh);
  }
}
 
class Vehicle
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter total number of Distinct cars:");
    int n=sc.nextInt();
    Vaahan ob[]=new Vaahan[n];
    for(int i=0;i<n;i++)
    {
     System.out.println("Enter model:"); 
     String m=sc.next();
     System.out.println("Enter Color:");
     String c=sc.next();
     System.out.println("Enter the year launched:");
     int y=sc.nextInt();
     ob[i]=new Vaahan(m,c,y);
     ob[i].display();
    }
  }
}

