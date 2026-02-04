// Write a program to find the maximum of two numbers.

class Logic 
{
    int iNo1 = 0;
    int iNo2 = 0;

    void findMax(int a, int b)
    {
        iNo1 = a;
        iNo2 = b;

        if(iNo1 == iNo2)
        {
            System.out.println("Both are equal");
        }

        else if(iNo1 > iNo2)
        {
            System.out.println(iNo1+" is greater");
        }
        else
        {
            System.out.println(iNo2+" is greater");

        }
        

    }
}

class program17_3
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.findMax(11,21);
    }
}