import java.util.*;
public class MatrixInv{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Mat M1=new Mat();
        System.out.println("Enter the 2x2 Matrix values:");
        for(int i=0;i<2;i++)
           for(int j=0;j<2;j++)
           {
               M1.arr[i][j]=sc.nextInt();
           }
        Mat M2=new Mat(M1);   
        M2.detm();
        M2.inverse();
        M2.display();
    }
}
class Mat
{
    int arr[][]=new int[2][2];
    double inv[][]=new double[2][2];
    int det;
    Mat()
    {
        for(int i=0;i<2;i++)
           for(int j=0;j<2;j++)
               arr[i][j]=0;
    }
    Mat(Mat ob)
    {
        for(int i=0;i<2;i++)
           for(int j=0;j<2;j++)
              arr[i][j]=ob.arr[i][j];
    }
    void detm()
    {
        det=(arr[0][0]*arr[1][1])-(arr[0][1]*arr[1][0]);
    }
    void inverse()
    {
        if(det==0)
           System.out.println("Inverse not possible!!");
        else 
        {
            int cof[][]=new int[2][2];
            for(int i=0;i<2;i++)
                for(int j=0;j<0;j++)
                {
                    double m=Math.pow(-1,(i+j));
                    cof[i][j]=m*arr[i][j];
                }
            inv[0][0]=(double)cof[1][1]/det;
            inv[0][1]=(double)cof[0][1]/det;
            inv[1][0]=(double)cof[1][0]/det;
            inv[1][1]=(double)cof[0][0]/det;
        }   
    }
    void display()
    {
        System.out.println("The inverse matrix is:");
        for(int i=0;i<2;i++)
           for(int j=0;j<2;j++)
               System.out.print(inv[i][j]+" ");
    }
}  
