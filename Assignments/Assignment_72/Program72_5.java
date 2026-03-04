import java.util.*;

class Matrix
{
    void SwapRows(int Arr[][], int iRow, int iCol)
    {
        
        int i=0, j=0;

        for(i = 0; i<iRow-1; i+=2)
        {
            for(j = 0; j<iCol; j++)
            {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[i+1][j];
                Arr[i+1][j] = temp;

            }
        }

        System.out.println("Matrix after swapping the rows");

        for( i = 0; i<iRow ; i++)
        {
            for(j = 0; j<iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }

            System.out.println();
        }

    }

}

class Program72_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

       

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

        mobj.SwapRows(Arr, iRow, iCol);

       

    }
}