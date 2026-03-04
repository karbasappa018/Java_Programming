import java.util.*;

class Matrix
{
    int FrequancyCount(int Arr[][], int iRow, int iCol, int no)
    {
        int iCount = 0;

        for(int i = 0; i<iRow; i++)
        {
            for(int j = 0; j<iCol; j++)
            {
                if(Arr[i][j] == no)
                {
                    iCount++;

                }
            }
        }

        return iCount;

    }

}

class Program72_2
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

        iRet = mobj.FrequancyCount(Arr, iRow, iCol, 9);

        System.out.println("Frerquancy count of number :"+iRet);


    }
}