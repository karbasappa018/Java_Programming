//  Write a program to find the smallest digit in a given number

class Logic
{
    void findSmallestDigit(int num)
    {
        int iDigit = 0;
        int iMin = 9;
        while(num>0)
        {
            iDigit = num%10;

            if(iDigit<iMin)
            {
                iMin = iDigit;
            }

            num = num/10;
        }

        System.out.println("smallest number is:"+iMin+"\n");
    }

}
class Program20_5
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45672);
    }
}