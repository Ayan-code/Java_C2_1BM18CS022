import java.util.*;
class Student
{
 String USN,name;
 int cred[],marks[],sub;
 void accept()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter USN:");
  USN=sc.nextLine();
  System.out.println("Enter Name:");
  name=sc.nextLine();
  System.out.println("Enter the no. of subjects:");
  sub=sc.nextInt();
  cred=new int[sub];
  marks=new int[sub];
  System.out.println("Enter the credits and marks of the subjects respectively:");
  for(int i=0;i<sub;i++)
  {
   System.out.println("Subject "+(i+1)+":");
   cred[i]=sc.nextInt();
   marks[i]=sc.nextInt();
  }
 }
 void display()
 {
  System.out.println("USN:"+USN);
  System.out.println("Name"+name);
  calc();
 }
 void calc()
 {
  int tot=0,sumcred=0;
  for(int i=0;i<sub;i++)
  {
   if(marks[i]>=90&&marks[i]<=100)
      tot=tot+cred[i]*10;
   else if(marks[i]>=75&&marks[i]<90)
      tot=tot+cred[i]*9;
   else if(marks[i]>=60&&marks[i]<75)
      tot=tot+cred[i]*8;
   else if(marks[i]>=50&&marks[i]<60)
      tot=tot+cred[i]*7;
   else if(marks[i]>=40&&marks[i]<50)
      tot=tot+cred[i]*6;
   else
      tot=tot+0;
  }
  for(int i=0;i<sub;i++)
  {
    sumcred=sumcred+cred[i];
  }
  float sgpa=(float)tot/sumcred;
  System.out.println("SGPA:"+sgpa);
 }
}

class Stu
{
 public static void main(String args[])
 {
   Student S=new Student();
   System.out.println("Enter details of Student:");
   S.accept();
   System.out.println("Details of the student:");
   S.display();
 }
}
 
   
    
















      
