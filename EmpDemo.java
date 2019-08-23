import java.util.*;
class Employee
{
    int emp_no,Basic;
    double DA,IT,netsal;
    String name;
    void indata()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Employee name");
        name=s.nextLine();
        System.out.println("Enter Employee number");
        emp_no=s.nextInt();
        System.out.println("Enter his Basic Salary");
        Basic=s.nextInt();
    }
    void calc()
    {
        DA=(0.75*Basic);
        IT=(0.3*(DA+Basic));
        netsal=Basic+DA-IT;
    }
    void display()
    {
        System.out.println("Details of the employee are :");
        System.out.println("Employee number is: "+emp_no);
        System.out.println("Employee Name is: "+name);
        System.out.println("Total salary = "+netsal);
    }
}
class EmpDemo
 {
    public static void main(String args[])
    {
        System.out.println("Employee details");
        Employee e1=new Employee();
        e1.indata();
        e1.calc();
        e1.display();
    }
 }