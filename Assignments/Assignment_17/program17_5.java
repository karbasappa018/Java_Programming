// Write a program to print the multiplication table of a number.

class Logic 
{
    int iCnt = 0;
    int table = 0;
    

    void printTable(int num)
    {
        for(iCnt = 1;iCnt <=10; iCnt++)
        {
            table = num * iCnt;
            System.out.println(table);

        }
    

    }
}

class program17_5
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.printTable(5);
    }
}