//   Write a program to check wheather a number is divisible by 5 and 11 or not

class Logic
{
    void checkDivisible(int num)
    {
        if(num%5 == 0)
        {
            System.out.println("Number is divisible by 5\n");
        }
        else
        {
            System.out.println("Number is divisible by 5\n");

        }

        if(num%11 == 0)
        {
            System.out.println("Number is divisible by 11\n");
        }
        else
        {
            System.out.println("Number is divisible by 11\n");

        }

        if(num%5 != 0 && num%11 != 0)
        {
            System.out.println("Number is not divisible by 5 and 11\n");
        }
    }


}
class Program19_3
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.checkDivisible(55);
    }
}