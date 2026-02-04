// Write a program to print all odd numbers up to N.

class Logic
{
    void PrintOddNumbers(int n)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt<=n; iCnt++)
        {
            if(iCnt%2 != 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }

}
class program18_3
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.PrintOddNumbers(20);
    }
}