// Write a program to check whether a number is positive, negative, or zero.

class Logic
{
    void checkSign(int num)
    {
        if(num<0)
        {
            System.out.println("Number is negative signed\n");

        }
        else
        {
            System.out.println("Number is positive signed\n");
        }

    }

}

class program18_5
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}