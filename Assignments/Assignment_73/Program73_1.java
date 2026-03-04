import java.util.*;

class Matrix
{
    void Transpose(int Arr[][],int iRow, int iCol)
    {
        for(int j =0; j<iCol; j++)
        {
            for(int i = 0; i<iRow; i++)
            {
                System.out.print(Arr[i][j]+"\t");
            }

             System.out.println();
        }

    }

}

class Program73_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int iRow = sobj.nextInt();

        System.out.println("Enter the number of coloumns");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        for(int i = 0; i<iRow; i++)
        {
            for(int j = 0; j<iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }

           
        }

        Matrix mobj = new Matrix();

        mobj.Transpose(Arr, iRow, iCol);


    }
}

