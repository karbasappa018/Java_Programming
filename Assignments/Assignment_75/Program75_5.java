import java.util.*;

class Program75_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int Income = 0;
        double TaxPayble = 0;

        System.out.println("Enter the income");
        Income = sobj.nextInt();

        if(Income < 0)
        {
            System.out.println("Income Cannot be Negative");
            return;
        }

        if(Income <= 250000)
        {
            TaxPayble = Income * 0;

        }   
        else if(Income > 250000 && Income <=500000)
        {
            TaxPayble = (double)(Income-250000) * 0.05;
        }
        else if(Income > 500000 && Income<= 1000000)
        {
            TaxPayble = ((double)250000 * 0.05) +(double)(Income - 500000)* 0.2;
        }
        else if(Income > 1000000)
        {
            TaxPayble = (double)(250000* 0.05) + (double)(500000 * 0.2) + (double)(Income - 1000000);
        }

        System.out.println("Annual Income :"+Income);
        System.out.println("Total Tax payble :"+ TaxPayble);
    }
}