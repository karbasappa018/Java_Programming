// Write a program to count the number of digits in a given number.

class Logic
{
    void countDigits(int num)
    {
        int digit=0;
        int Count = 0;

        while(num!= 0)
        {
            digit = num%10;
            if(digit!=0)
            {
                Count++;
            }
            num = num/10;
        }
        System.out.println("Number of digits are:"+Count+"\n");
    }

}

class program16_5
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.countDigits(2345);

    }
}