import java.util.*;

class Wrongage extends Exception
{
   String s;
   Wrongage(String n)
   {
      s=n;
   }
   public String toString()
   {
      return s;
   }
}
  
class Father
{
   int age1;
   Father() throws Wrongage
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter father's age:");
      age1=sc.nextInt();
      if(age1<=0)
         throw new Wrongage("invalid age");
   }
}

class Son extends Father
{
   int age2;
   Son() throws Wrongage
   {  
      super();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter son's age:");
      age2=sc.nextInt(); 
      if(age2<0)
         throw new Wrongage("invalid age");
      if(age1-age2<21)
         throw new Wrongage("Difference of ages is illegal");
   }
}

class Excp
{
    public static void main(String args[])
    {
        try
        {
             Son s=new Son();
        }
        catch(Wrongage e)
        {
           System.out.println(e);
        }
     }
}

