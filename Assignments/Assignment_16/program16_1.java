// Write a program to calculate the sum of first N natural numbers.

class Logic
{
    void calculateSum(int n)
    {
        int iSum =0;
        int iCnt = 0;
        for(iCnt = 0; iCnt<=n; iCnt++)
        {
            iSum = iSum+iCnt;
        }

        System.out.println("Sum of first N namtural number is:"+iSum+"\n");
    }

}

class program16_1
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.calculateSum(15);

    }
}