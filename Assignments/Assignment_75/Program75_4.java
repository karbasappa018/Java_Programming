import java.util.*;

class Program75_4
{
    int TotalFineAmount = 0;

    public void Fine(int FineAmount)
    {
        
        TotalFineAmount = TotalFineAmount + FineAmount;
    }


    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        String HelmetWorn = null;
        String Licence = null;
        String OverSpeed = null;
        

        Program75_4 pobj = new Program75_4();

        System.out.println("Helmet Worn:");
        HelmetWorn = sobj.next();

        if((HelmetWorn.equalsIgnoreCase("Yes")||
            HelmetWorn.equalsIgnoreCase("No"))== false
            )

        {
            System.out.println("Input must be Yes/No only");
            return;
        }

        System.out.println("License Available (Yes/No)");
        Licence = sobj.next();

        if((Licence.equalsIgnoreCase("Yes")||
            Licence.equalsIgnoreCase("No"))== false
            )

        {
            System.out.println("Input must be Yes/No only");
            return;
        }

        System.out.println("Overspeeding (Yes/No)");
        OverSpeed = sobj.next();

        if((OverSpeed.equalsIgnoreCase("Yes")||
            OverSpeed.equalsIgnoreCase("No"))== false
            )

        {
            System.out.println("Input must be Yes/No only");
            return;
        }

        if(HelmetWorn.equalsIgnoreCase("Yes"))
        {
           
            pobj.Fine(500);
        }
        
        if(Licence.equalsIgnoreCase("Yes"))
        {
            
            pobj.Fine(1000);
        }
        
        if(OverSpeed.equalsIgnoreCase("Yes"))
        {
            
            pobj.Fine(1500);
        }

        System.out.println("Total fine amount:"+pobj.TotalFineAmount);
        
        

    }

    
}