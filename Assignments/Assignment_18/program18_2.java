// Write a program to print all even numbers up to N.

class Logic
{
    void PrintEvenNumbers(int n)
    {
        int iCnt = 0;
        for(iCnt = 2; iCnt<=n; iCnt++)
        {
            if(iCnt%2 == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }

}
class program18_2
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.PrintEvenNumbers(20);
    }
}