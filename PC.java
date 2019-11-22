import java.util.*;

class Q
{
   int m;
   boolean Valueset=false;
   synchronized int get()
   {
          try
          {
              while(!Valueset)
              {
                wait();
              }
          }

          catch(InterruptedException e)
          {
             System.out.println("Interrupted");
          }
       System.out.println("GET:"+m);
       Valueset=false;
       notify();
       return m;
    }
    synchronized void put(int n)
    {
          try
          {     
            while(Valueset)
            {
                 wait();
            }
          }
            catch(InterruptedException e)
            {   
               System.out.println("Interrupted");
            }
            m=n;
            System.out.println("PUT:"+m);
            Valueset=true;
            notify();

    }   
}

class Producer implements Runnable
{
    Q q;
    Producer(Q q)
    {
       this.q=q;
       new Thread(this,"Producer").start();
    }
    public void run()
    {
        int i=0;
        while(true)
             q.put(i++);
    }
}

class Consumer implements Runnable
{
    Q q;
    Consumer(Q q)
    {
        this.q=q;
        new Thread(this,"Consumer").start();
    }
    public void run()
    {
         while(true)
             q.get();
    }
}

class PC
{  
     public static void main(String args[])
     {
         Q q=new Q();
         new Producer(q);
         new Consumer(q);
     }
}
                
