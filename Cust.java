import java.util.*;
class Customer
{
 private String cname;
 private int cnum,qty;
 private double price,totprice,dis,netprice;
 Customer(String cname,int cnum,int qty,double price)
 { 
  this.cname=cname;
  this.cnum=cnum;
  this.qty=qty;
  this.price=price;
 }

 void get()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the customer details:");
  System.out.println("Enter name:");
  cname=sc.next();
  System.out.println("Enter customer number:");
  cname=sc.nextInt();
  System.out.println("Enter quantity:");
  qty=sc.nextInt();
  System.out.println("Enter price:");
  price=sc.nextDouble();
  compute();
 }
 void compute()
 {
   totprice=price*qty;
   if(totprice>=25000.0)
     dis=0.1*totprice;
   else if(totprice>=50000.0)
     dis=0.25*totprice;
   else 
     dis=0;
   netprice=totprice-dis;
 }
 void display()
 {
   
  
