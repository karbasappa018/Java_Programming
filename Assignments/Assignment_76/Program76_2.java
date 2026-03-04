import java.util.*;

class Program76_2
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);
        int Marks = 0;
        int Attendance = 0;
        int FamilyIncome = 0;

        System.out.println("Enter the Marks");
        Marks = sobj.nextInt();

        System.out.println("Enter the Attendance");
        Attendance = sobj.nextInt();

        System.out.println("Enter the Family Income");
        FamilyIncome = sobj.nextInt();

        if((Marks<0 || Marks > 100 )  ||  (Attendance< 0 || Attendance > 100))
        {
            
            System.out.println("Marks and Attendance must be 0-100");
            return;
        }
        else if(FamilyIncome < 0)
        {
            System.out.println("Income cannot be negative");
            return;

        }
        else if(Marks < 80)
        {
            System.out.println("Scholership Rejected");
            System.out.println("Reason :Marks >= 80");

        }
        else if(Attendance< 75)
        {
            System.out.println("Scholership Rejected");
            System.out.println("Reason : Attendance > 75");

        }
        else if(FamilyIncome > 300000)
        {
            System.out.println("Scholership Rejected");
            System.out.println("Reason : Family Income >= 300000");

        }
        else 
        {    System.out.println("Scholership Approved");

        }
        
        
    }
}