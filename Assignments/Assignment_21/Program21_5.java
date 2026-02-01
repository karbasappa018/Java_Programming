// Write a program to print all numbers from 1 to N that are divisible by both 2 and 3.

class Logic 
{
    void printDivisibleBy2and3(int n)
    {
        int iCnt = 0;
        for(iCnt =1; iCnt <= n; iCnt++)
        {
            if(iCnt%2 == 0 && iCnt %3 == 0)
            {
                System.out.println("divisible by 2 and 3:"+iCnt);
            }
           
        }
    }

}
class Program21_5
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}