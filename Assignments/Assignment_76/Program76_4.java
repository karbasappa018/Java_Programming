import java.util.*;

class Program76_4
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int BudgetAmount = 0;
        int NumOfItems = 0;
        int NItemPrices = 0;
        int i = 0;
        int iSum = 0;

        System.out.println("Enter the Budget Amount");
        BudgetAmount = sobj.nextInt();

        if(BudgetAmount < 0)
        {
            System.out.println("Budget cannot be negative");
            return;
        }

        System.out.println("Number of items have been purchased");
        NumOfItems = sobj.nextInt();

        if(NumOfItems < 0)
        {
            System.out.println("Items cannot be negative");
            return;
        }

        int Arr[] = new int[NumOfItems];

        System.out.println("Enter the Amounts of the items have been purchased");

        for(i = 0; i<NumOfItems; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        for(i = 0; i<NumOfItems; i++)
        {
            iSum = iSum + Arr[i];
        }

        System.out.println("Items Purchased: "+NumOfItems);
        System.out.println("Remaining Balance: "+(BudgetAmount-iSum));




        
    }
}
