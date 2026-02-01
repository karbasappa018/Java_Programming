//  Write program to display all factors of a given number

class Logic
{
    void displayFactors(int num)
    {
        int iCnt = 0;
        System.out.print("Factors are : ");
        for(iCnt = 1; iCnt<= num/2; iCnt++)
        {
            if(num%iCnt == 0)
            {
                
                System.out.print(iCnt+"\t");
            }

        }
        System.out.println();
    }

}
class Program21_3
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.displayFactors(12);
    }
}