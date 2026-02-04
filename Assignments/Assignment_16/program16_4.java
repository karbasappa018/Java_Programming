// Write a program to reverse a number.

class Logic
{
    void reverseNumber(int num)
    {
        int reverse = 0;
        int digit = 0;

        while(num!= 0)
        {
            digit= num%10;
            reverse = (reverse*10)+digit;
            num = num/10;
        }

        System.out.println("Revese number is:"+reverse+"\n");

    }

}
class program16_4
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);

    }
}