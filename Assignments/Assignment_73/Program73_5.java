import java.util.*;

class Matrix
{
    boolean ChkSparse(int Arr[][],int iRow, int iCol)
    {
        int CountZero = 0;
        int CountNonZero = 0;

        for(int i = 0; i<iRow; i++)
        {
            for(int j =0; j<iCol; j++)
            {
               if(Arr[i][j] == 0)
               {
                    CountZero++;
               }
               else
               {
                    CountNonZero++;
               }

            }

           

        }

         if(CountZero> CountNonZero)
         {
            return true;
         }
         else
         {
            return false;
         }

    }    

   
}

class Program73_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        boolean bRet = false;


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

        bRet = mobj.ChkSparse(Arr, iRow, iCol);

        if(bRet == true)
        {
            System.out.println("This is sparse matrix");

        }
        else
        {
            System.out.println("This is not sparse matrix");
        }


    }
}

