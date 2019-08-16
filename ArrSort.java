import java.util.*;
class ArrSort
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of array:");
  int sz=sc.nextInt();
  int arr[]=new int[sz];
  System.out.println("Enter the array elements:");
  for(int i=0;i<sz;i++)
  { 
   arr[i]=sc.nextInt();
  }
  for(int i=0;i<sz-1;i++)
  {
    for(int j=i+1;j<sz;j++)
    {
     if(arr[i]>arr[j])
     { 
       int t=arr[i];
       arr[i]=arr[j];
       arr[j]=t;
     }
    }
   }
  System.out.println("Ascending array is:\n");
  for(int i=0;i<sz;i++)
  { 
   System.out.print(arr[i]);
  } 
 }
}
