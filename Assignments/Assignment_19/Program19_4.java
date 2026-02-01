//  write a program to print each digit of a number separately

class Logic
{
    void printDigits(int num)
    {
        int iDigit = 0;
        while(num!= 0)
        {
            iDigit = num%10;
            System.out.println(iDigit+"\n");
            num = num/10;

        }

    }

    /*
  
    void printDigits(int num)
    {
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
    }
 
    */

}
class Program19_4
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}