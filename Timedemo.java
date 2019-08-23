import java.util.*;
class Time
{
 int hr,min,sec;
 Time()
 {
   hr=0;
   min=0;
   sec=0;
 }
 Time(int h,int m,int s)
 {
   hr=h;
   min=m;
   sec=s;
 }
 void advance(int h,int m,int s)
 {
  hr+=h;
  min+=m;
  sec+=s;
  if(sec>=60)
  {
   min=min+sec/60;
   sec=sec%60;
  }
  if(min>=60)
  {
   hr=hr+min/60;
   min=min%60;
  }
  if(hr>=24)
    hr=hr%24;
 }
void currtime(int a,int b,int c)
{
  hr=a;
  min=b;
  sec=c;
}

void print()
{
 System.out.println(hr+":"+min+":"+sec);
}

class Timedemo
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int ch;
  Time T=new Time();
  while(1)
  {
   System.out.println("Enter your choice:");
   ch=sc.nextInt();
   switch(ch)
   {
    case 1:  System.out.println(Enter hours min and second:");
             int h1=sc.nextInt();
             int m1=sc.nextInt();
             int s1=sc.nextInt();
             Time T1=new Time(h1,m1,s1);
             break;
    case 2:  
  
