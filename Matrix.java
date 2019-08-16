import java.util.*;
class Matrix
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the row size of array 1:");
  int r1=sc.nextInt();
  System.out.println("Enter the column size of array 2:");
  int c1=sc.nextInt();
  int arr1[][]=new int[r1][c1];
  System.out.println("Enter the 2-d array elements");
  for(int i=0;i<r1;i++)
  {
   for(int j=0;j<c1;j++)
   {  
    arr1[i][j]=sc.nextInt();
   }
  }
  System.out.println("The column and row size of array 1 and 2 should be same");
  System.out.println("Enter the row size of array 2:");
  int r2=sc.nextInt();
  System.out.println("Enter the column size of array 2:");
  int c2=sc.nextInt();
  int arr2[][]=new int[r2][c2];
  System.out.println("Enter the 2-d array elements");
  for(int i=0;i<r2;i++)
  {
   for(int j=0;j<c2;j++)
   {  
    arr2[i][j]=sc.nextInt();
   }
  }
  if(r1!=r2||c1!=c2)
     System.out.println("Not valid for Operation");
  else
  {
   System.out.println("Addition of matrices\n");
   for(int i=0;i<r1;i++)
   {
    for(int j=0;j<c1;j++)
       System.out.print((arr1[i][j]+arr2[i][j])+" ");
    System.out.println();
   }
   System.out.println("Subtraction of matrices\n");
   for(int i=0;i<r1;i++)
   {
    for(int j=0;j<c1;j++)
       System.out.print((arr1[i][j]-arr2[i][j])+" ");
    System.out.println();
   }
  }
 }
}

