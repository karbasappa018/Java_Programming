import java.util.*;

class Program76_5
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int BatteryPercentage = 0;

        System.out.println("Enter the Battery Percentage");
        BatteryPercentage = sobj.nextInt();

        System.out.println("Battery Percentage: "+BatteryPercentage);

        if(BatteryPercentage <= 5)
        {
            System.out.println("Status : Critical");
        }
        else if(BatteryPercentage <= 15)
        {
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Status : Normal");
        }



        
    }
}
