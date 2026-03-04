import java.util.*;

class Program76_1
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int Distance = 0;
        double BaseFare = 50.0;
        double TotalFare = 0.0;
        String PeakHours = null;

        System.out.println("Enter the Distance");
        Distance = sobj.nextInt();

        System.out.println("Peak hour : (Yes/No)");
        PeakHours = sobj.next();

       

        if(Distance < 0)
        {
            System.out.println("Distance cannot be negative");
        }

        if(Distance <= 10)
        {
            TotalFare = 50.0 + (double)(Distance * 12);
        }
        else if(Distance > 10)
        {
            TotalFare = 50.0 + 120.0 +(double) (Distance - 10)* 15;
        }

        if(PeakHours.equalsIgnoreCase("Yes"))
        {
            TotalFare = TotalFare +(TotalFare * 0.2);
            System.out.println("Total Fare :"+TotalFare);
        }
        else if(PeakHours.equalsIgnoreCase("NO"))
        {
            TotalFare = TotalFare;
            System.out.println("Total Fare :"+TotalFare);
        }


       
    }
}