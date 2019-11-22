import java.util.*;


class A implements Runnable
{
    Thread t1;
    A()
    {
         t1=new Thread(this,"A");
         t1.start();
    }
    public void run()
    {
       try
       {
           for(int i=1;i<10000;i++)
           {
                System.out.println("BMSCE");
                Thread.sleep(10000);
           }
       }
       catch(InterruptedException e)
       {
              System.out.println("How u doing");
       }
    }
}

    
class B implements Runnable
{
    Thread t2;
    B()
    {
         t2=new Thread(this,"B");
         t2.start();
    }
    public void run()
    {
       try
       {
           for(int i=1;i<10000;i++)
           {
                System.out.println("CSE");
                Thread.sleep(2000);
           }
       }
       catch(InterruptedException e)
       {
              System.out.println("How u doing");
       }
    }
}
     

class Multidemo
{
  public static void main(String args[])
  {
        new A();
        new B();
  }
}
   
