import java.util.*;

class Program76_3
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        int ParcelWeight = 0;
        int CourierCharge = 0;
        System.out.println("Enter the weight");
        ParcelWeight = sobj.nextDouble();

        if(ParcelWeight < 0)
        {
            System.out.println("Weigtht must be > 0");
            return ;
        }
        else if(ParcelWeight == 1 )
        {
            CourierCharge = 50;
        }
        else if(ParcelWeight >1 && ParcelWeight<=5)
        {
            CourierCharge = 50 + (ParcelWeight * 20);
        }
        else if(ParcelWeight > 5 )
        {
            CourierCharge = 150 + (ParcelWeight * 30);
        }

        System.out.println("Parcel Weight : "+ParcelWeight);
        System.out.println("Courier Charge: "+CourierCharge);
    }
}