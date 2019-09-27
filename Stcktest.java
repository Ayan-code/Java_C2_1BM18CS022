import java.util.*;
interface stack
{
  int pop();
  void push(int ele);
  void print();
}

class DynaStat implements stack
{
  int SIZE=10;
  int stk[]=new int[SIZE];
  int top;
  DynaStat()
  {
    top=-1;
  }
  public void push(int ele)
  {
    if(top==SIZE-1)
    {
       SIZE=SIZE*2;
       int temp[]=new int[SIZE];
       for(int i=0;i<SIZE;i++)
         temp[i]=stk[i]; 
       stk=temp;
       stk[++top]=ele;
    }
    else
     stk[++top]=ele;
  }
  public int pop()
  {
    if(top==-1)
    {
      System.out.println("Stack underflow!!!");
      return -99;
    }
    else
    {
      int e=stk[top--];
      return e;
    }
  }
  public void print()
  {
    if(top==-1)
        System.out.println("Stack underflow!!");
    else
    {
      for(int i=top;i>=0;i--)
      {
        System.out.println(stk[i]+" ");
      }
    }
  }
}

class Stcktest
{  
  public static void main(String args[])
  {
    int ele,ch=0;
    stack ref;
    ref=new DynaStat();
    Scanner sc=new Scanner(System.in);
    while(ch!=4)
    {
      System.out.println("Enter your choice: 1.Push 2.Pop 3.Print 4.Exit");
      ch=sc.nextInt();
      switch(ch)
      { 
    
       case 1:  System.out.println("Enter the element to be push");
                ele=sc.nextInt();
                ref.push(ele);
                break;
       case 2:  int x=ref.pop();
                if(x!=-99)
                { 
                  System.out.println("Popped element:"+x);
                }
                break;
       case 3:  ref.print();
                break;
       case 4:  break;
       }
      }
    }
}  
 
                  

    
  

 
  
 
