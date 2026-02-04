// Write a program to check whether a number is prime or not.

class Logic
{
    void checkPrime(int num)
    {
        int iCnt = 0;
        int iCount = 0;
        
        for(iCnt =2;iCnt<=num/2;iCnt++)
        {
            if(num%iCnt!=0)
            {
                iCount++;
                
            }
           
        }

        if(iCount != 0)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Numbern is not prime\n");
        }

    }
}

class program18_1
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}