import java.util.*;

class Program75_1
{
    public static void main(String a[])
    {
       Scanner sobj = new Scanner(System.in);

       int TotalHours = 0;
       int Charges = 0;

       System.out.println("Enter the Total hours a vehicle stayed:");
       TotalHours = sobj.nextInt();

       if(TotalHours < 0)
       {
            System.out.println("Hours cannot be negative");
            return;

       }

       if(TotalHours >= 1 && TotalHours <= 2)
       {
            Charges = 20;
       }
       else if(TotalHours >2 && TotalHours<=10)
       {
            Charges = (20) + (TotalHours-2) * 10;
       }
       else if(TotalHours>10)
       {
            Charges = (20) + (8 * 10) + 50;
       }

       System.out.println("Total parking Duration:"+TotalHours);
       System.out.println("Total Parking fee:"+Charges);



    }
}