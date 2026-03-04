import java .util.*;

class Matrix
{
   
    int AddDiagonal(int Arr[][],int iRow, int iCol)
    {
        int iSum = 0;

        for(int i = 0; i<iRow; i++)
        {
            for(int j=0; j<iCol; j++)
            {
                if(i==j)
                {
                    iSum = iSum + Arr[i][j];

                }
            }
            System.out.println();
        }

        return iSum;

    }
    
}

class Program72_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner (System.in);

        int iRet = 0;

        System.out.println("Enter the number of rows:");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of coloumns:");
        int iCol = sobj.nextInt();

        int Arr[][]= new int[iRow][iCol];

        System.out.println("Enter the Matrix elements:");

        for(int i = 0; i<iRow; i++)
        {
            for(int j= 0; j<iCol; j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }

        Matrix mobj = new Matrix();
        iRet = mobj.AddDiagonal(Arr,iRow,iCol);

        System.out.println("Addition of diagonal elements:"+iRet);
    }
}