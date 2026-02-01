// Write a program to calculate the power of number using loops. 

class Logic
{
    void calculatePower(int base ,int exp)
    {
        int i = 0;
        int iPower = base;
        for(i = 2; i<=exp; i++)
        {
            iPower= iPower*2;

        }

        System.out.println("Power of Number is:"+iPower+"\n");
    }

}
class Program19_5
{
    public static void main(String a[])
    {
        Logic obj = new Logic ();
        obj.calculatePower(2,5);
    }
}