import java.util.*;
class Person
{
  String name;
  String addr;
  int age;
  void get()
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Person's INFO:");
   System.out.println("Enter name:");
   name=sc.next();
   System.out.println("Enter address:");
   addr=sc.next();
   System.out.println("Enter age:");
   age=sc.nextInt();
  }
  void display()
  {
   System.out.println("INFO:");
   System.out.println("Name:"+name+" Age:"+age+" Address:"+addr);
  } 
}
class Stud extends Person
{
  int roll;
  int sem;
  void get()
  {
   super.get();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the student's Info:");
   System.out.println("Enter roll no.:");
   roll=sc.nextInt();
   System.out.println("Enter the sem:");
   sem=sc.nextInt();
  }
  void display()
  {
   super.display();
   System.out.println("Info:");
   System.out.println("Rool no.:"+roll+" Sem:"+sem);
  }
}
class Exam extends Stud
{
  double marks1,marks2;
  void get()
  {
    super.get();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks:");
    marks1=sc.nextDouble();
    marks2=sc.nextDouble();
  }
  double compute()
  {
   return (marks1+marks2)/2;
  }
  void display()
  {
   super.display();
   System.out.println("Marks:"+marks1+" "+marks2);
  }
}

class DemoStud
{
  public static void main(String args[])
  {
    double c=0.0;
    int a=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n=sc.nextInt();
    Exam ob[]=new Exam[n];
    for(int i=0;i<n;i++)
    {
      ob[i]=new Exam();
      ob[i].get();
      if(c<ob[i].compute())
      {
       c=ob[i].compute();
       a=i;
      }
    }
   System.out.println("The topper is:");
   ob[a].display();
   System.out.println("the average marks of topper is:"+c);
  }
}
    
  


