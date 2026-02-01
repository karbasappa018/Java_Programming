//  Write program to count total number of factors of a given number

class Logic
{
    void countFactors(int num)
    {
        int iCnt = 0;
        int iCount = 0;
       
        for(iCnt = 1; iCnt<= num/2; iCnt++)
        {
            if(num%iCnt == 0)
            {
                
                iCount++;
            }

        }
         System.out.print("total number of factors are : "+iCount);
       
    }

}
class Program21_4
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}