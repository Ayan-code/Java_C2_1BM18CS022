import java.util.*;
class Book
{
  String bname,author;
  double price;
  int num_pages;
  Scanner sc=new Scanner(System.in);
  Book()
  {
   bname="NULL";
   author="NULL";
   price=0.0;
   num_pages=0;
  }
  void set()
  {
   System.out.println("Enter the book name:");
   bname=sc.nextLine();
   System.out.println("Enter the Author name:");
   author=sc.nextLine();
   System.out.println("Enter the price of book:");
   price=sc.nextDouble();
   System.out.println("Enter the total num of pages:");
   num_pages=sc.nextInt();
  }
  void get()
  {
   System.out.println("The book name is:"+bname);
   System.out.println("The author name is:"+author);
   System.out.println("The price of book is:"+price);
   System.out.println("Total number of pages:"+num_pages);
  }
  public String toString()
  {
    String s="Book name:"+bname+" Author:"+author+" Price:"+price+" No. of pages:"+num_pages;
    return s;
  }
}
class BookD
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   Book b1=new Book();
   System.out.println("Using toString :");
   System.out.println(b1);
   System.out.println("Enter the number of books:");
   int n=sc.nextInt();
   Book b[]=new Book[n];
   for(int i=0;i<n;i++)
   {
     b[i]=new Book();
     b[i].set();
   } 
   for(int i=0;i<n;i++)
     b[i].get();
 }
}




OUTPUT:

Using toString :
Book name:NULL Author:NULL Price:0.0 No. of pages:0
Enter the number of books:
2
Enter the book name:
Halway
Enter the Author name:
Douglas
Enter the price of book:
23.78
Enter the total num of pages:
326
Enter the book name:
Get it
Enter the Author name:
Thakur
Enter the price of book:
56.80
Enter the total num of pages:
225
The book name is:Halway
The author name is:Douglas
The price of book is:23.78
Total number of pages:326

The book name is:Get it
The author name is:Thakur
The price of book is:56.8
Total number of pages:225

