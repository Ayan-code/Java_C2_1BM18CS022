import java.util.*;
class Gen<a,b>
{
   a ob1;
   b ob2;
   void display(a ob1,b ob2)
   {
      System.out.println(ob1+" "+ob2);
   }
}

public class Gdemo
{
    public static void main(String args[]) 
    {
        String s;
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string and integer:");
        s=sc.next();
        a=sc.nextInt();
        Gen<String,Integer> ob=new Gen<String,Integer>();
        ob.display(s,a);
    }
}
            
