//  Write a program to count how many even and odd numbers are present between 1 and N

class Logic
{
    void countEvenOddRange(int n)
    {
        int iCnt = 0;
        int iCountEven = 0;
        int iCountOdd = 0;

        for(iCnt = 1; iCnt <=n; iCnt++)
        {
            if(iCnt%2==0)
            {
                iCountEven++;
            }
            else
            {
                iCountOdd++;
            }

        }

        System.out.println("Even numbers are:"+iCountEven);
        System.out.println("Odd numbers are:"+iCountOdd);


    }

}
class Program21_2
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}