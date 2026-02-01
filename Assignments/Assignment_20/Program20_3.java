//  Write a program to check wheather a number is perfect number or not.

class Logic
{
    void checkPerfect(int num)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1; iCnt<=num/2; iCnt++)
        {
            if(num%iCnt==0)
            {
                iSum = iSum + iCnt;

            }

            if(iSum == num)
            {
                System.out.println("Number is perfect\n");
            }
        }

    }

}
class Program20_3
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);
    }
}