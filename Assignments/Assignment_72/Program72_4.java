import java.util.*;

class Matrix
{
    void  AddColoumn(int Arr[][], int iRow, int iCol)
    {
        
        int i=0, j=0;

        for(j = 0; j<iCol; j++)
        {
            int iColAdd  = 0;
            
            for(i = 0; i<iRow; i++)
            {
                iColAdd = iColAdd + Arr[i][j];
            }

            System.out.println("Addition of coloumn "+(j+1)+" is: "+iColAdd);

           
        }

    }

}

class Program72_4
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

        mobj.AddColoumn(Arr, iRow, iCol);

       

    }
}