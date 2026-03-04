import java.util.*;

class Matrix
{
    boolean ChkIndentity(int Arr[][],int iRow, int iCol)
    {

        for(int i = 0; i<iRow; i++)
        {
            for(int j =0; j<iCol; j++)
            {
                if(i == j)
                {
                   if(Arr[i][j] != 1)
                   {
                        return false;
                   }
                   
                }
                else
                {
                    if(Arr[i][j] != 0)
                    {
                        return false;

                    }

                }
                    

            }

           

        }

         return true;

       

        


    }    

   
}

class Program73_4
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

        bRet = mobj.ChkIndentity(Arr, iRow, iCol);

        if(bRet == true)
        {
            System.out.println("This is identity matrix");

        }
        else
        {
            System.out.println("This is not identity matrix");
        }


    }
}

