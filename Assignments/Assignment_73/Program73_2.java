import java.util.*;

class Matrix
{
    void ReverseRow(int Arr[][],int iRow, int iCol)
    {
       
       for(int i =0; i<iRow; i++)
       {
            int iStart = 0;
            int iEnd = iCol -1;

            while(iStart < iEnd)
            {
                int temp = Arr[i][iStart];
                Arr[i][iStart] = Arr[i][iEnd];
                Arr[i][iEnd] = temp;

                iStart++;
                iEnd--;
            }

       }

         for(int i = 0; i<iRow; i++)
         {
            for(int j = 0; j<iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }

            System.out.println();
         }



    }    

   
}

class Program73_2
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

        mobj.ReverseRow(Arr, iRow, iCol);


    }
}

