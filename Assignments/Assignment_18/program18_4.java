// Write a program to find the sum of even and odd digits separately in a number.

class Logic 
{
    void SumEvenOddDigits(int num)
    {
        
        int iDigit = 0;
        int iSumOdd = 0;
        int iSumEven = 0;
        while(num!= 0)
        {
            iDigit = num%10;
            if(iDigit%2 == 0)
            {
                iSumEven = iSumEven+iDigit;
            }
            else
            {
                iSumOdd = iSumOdd+iDigit;
            }

            num = num /10;
        }

        System.out.println("Sum of even digits are:"+iSumEven+"\n");
        System.out.println("Sum of odd digits are:"+iSumOdd+"\n");
        

    }

}
class program18_4
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.SumEvenOddDigits(123456);
    }
}