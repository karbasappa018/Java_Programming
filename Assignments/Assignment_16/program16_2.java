// Write a program to check whether a given number is even or odd.

class Logic
{
    void checkEvenOdd(int num)
    {
        if(num % 2== 0)
        {
            System.out.println("Number is Even\n");

        }
        else
        {
            System.out.println("Number is odd\n");
        }
    }

}
class program16_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(12);


    }
}