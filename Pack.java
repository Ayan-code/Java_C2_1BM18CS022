import java.util.*;
import CIE.*;
import SEE.External;

public class Pack
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     
     Internals s1=new Internals();
     System.out.println("Enter Name:");
     s1.name=sc.next();
     System.out.println("Enter USN:");
     s1.usn=sc.next();
     System.out.println("Enter semester:");
     s1.sem=sc.nextInt();
     System.out.println("Enter marks in cie for 5 sub");
     for(int i=0;i<5;i++)
     {
         System.out.println(i+1+":");
         s1.marks[i]=sc.nextInt();
     }
     External E=new External();
     System.out.println("Enter marks in see for 5 sub");
     for(int i=0;i<5;i++)
     {
         System.out.println(i+1+":");
         E.sem_marks[i]=sc.nextInt();
     }
     System.out.println("Total marks");
     for(int i=0;i<5;i++)
     {
         int m=s1.marks[i]+E.sem_marks[i]/2;
         System.out.println("Subject "+(i+1)+":"+m);
     }

   }
} 
