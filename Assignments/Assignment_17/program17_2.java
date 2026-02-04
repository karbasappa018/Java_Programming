// Write a program to check whether a number is a palindrome or not.

class Logic
{
    public int iDigit = 0;
    public int iReverse = 0;
    public int iOriginal = 0;

    void checkPalindrome(int num)
    {
        iOriginal= num;

        while(num!= 0)
        {
            
            iDigit = num%10;
            iReverse = (iReverse*10)+iDigit;

            num  = num/10;
        }

        if(iOriginal == iReverse)
        {
            System.out.println("Given number is palindrome");
        }
        else
        {
            System.out.println("Given number is palindrome");

        }
        
    }

}

class program17_2
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.checkPalindrome(121);

    }
}