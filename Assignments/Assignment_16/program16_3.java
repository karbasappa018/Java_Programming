// Write a program to find the factorial of a number using a for loop.

class Logic
{
    void findFactorial(int num)
    {
        int iCnt = 0;
        int iFact = 1;

        for(iCnt = num;iCnt>=1;iCnt--)
        {
            iFact = iFact*iCnt;
        }

        System.out.println("Factorial of the number is:"+iFact+"\n");

    }

}
class program16_3
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);

    }



}