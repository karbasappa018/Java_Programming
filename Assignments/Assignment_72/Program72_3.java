import java.util.*;

class Matrix
{
    int MaxDiagonal(int Arr[][], int iRow, int iCol)
    {
        int largestNum = 0;

        for(int i = 0; i<iRow; i++)
        {
            for(int j = 0; j<iCol; j++)
            {
                if(i==j)
                {
                    if(Arr[i][j] > largestNum)
                    {
                        largestNum = Arr[i][j];
                    }

                }
            }
        }

        for(int i = 0; i<iRow; i++)
        {
            for(int j = iCol-1; j>0; j--)
            {
                if(Arr[i][j] > largestNum)
                {
                    largestNum = Arr[i][j];
                }
            }
        }

        return largestNum;

    }

}

class Program72_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int iRet = 0;

        System.out.println("Enter the number of rows:");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of coloumns:");
        int iCol = sobj.nextInt();

        System.out.println("Enter the Elements of Array:");

        int Arr[][] = new int[iRow][iCol];

        for(int i = 0; i<iRow; i++)
        {
            for(int j = 0; j<iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        sobj.close();

        Matrix mobj = new Matrix();

        iRet = mobj.MaxDiagonal(Arr, iRow, iCol);

        System.out.println("Largest number from both the diagonals :"+iRet);


    }
}