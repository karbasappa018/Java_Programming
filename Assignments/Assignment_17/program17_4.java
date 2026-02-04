// Write a program to find the minimum of three numbers.


class Logic 
{
    int iNo1 = 0;
    int iNo2 = 0;
    int iNo3 = 0;

    void findMax(int a, int b, int c)
    {
        iNo1 = a;
        iNo2 = b;
        iNo3 = c;

        if(iNo1 == iNo2)
        {
            System.out.println("Both are equal");
        }

        else if(iNo1 < iNo2)
        {
            System.out.println(iNo1+" is minimum");
        }
        else
        {
            System.out.println(iNo2+" is minimum");

        }
        

    }
}

class program17_4
{
    public static void main(String a[])
    {
        Logic lobj = new Logic();
        lobj.findMax(3,7,2);
    }
}