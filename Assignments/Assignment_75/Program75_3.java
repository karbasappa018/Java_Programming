import java.util.*;

class Program75_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int CurrentStock = 0;
        int RequestedQuantity = 0;
        
        System.out.println("Enter the Current Stock:");
        CurrentStock = sobj.nextInt();

        System.out.println("Enter the Requested Quantity:");
        RequestedQuantity = sobj.nextInt();

        if(CurrentStock < 0)
        {
          System.out.println("Stock cannot be negative");
          return;
        }
        else if(RequestedQuantity < 0)
        {
          System.out.println("Requested quantity cannot be negative");
          return;
        }
        else if(RequestedQuantity > CurrentStock)
        {
          System.out.println("Order Failed : Insufficient Stock");
        }
        
        else if(CurrentStock > RequestedQuantity)
        {
          System.out.println("Order Processed Successfully");
          CurrentStock = CurrentStock - RequestedQuantity;

          System.out.println("Remaining Stock :"+CurrentStock);

          if(CurrentStock < 5)
          {
            System.out.println("Low Stock Alert");
          }


        }




       

    }
}