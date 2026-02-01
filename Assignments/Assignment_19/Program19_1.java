//  Write a program to check wheather a given year is leap or not.

class Logic
{
    void checkLeapYear(int year)
    {
        if(year%4==0)
        {
            System.out.println("Year is leap\n");
        }
        else
        {
            System.out.println("Year is not leap\n");

        }

    }

}
class Program19_1
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}