import java.util.*;

class Program75_2
{
    public static void main(String a[])
    {
       Scanner sobj = new Scanner(System.in);

       int Age = 0;
       int Income = 0;
       int CreditScore = 0;
       String ExistUnpaidLoan = null;

       System.out.println("Enter the Age:");
       Age = sobj.nextInt();

       System.out.println("Enter the Monthly Income:");
       Income = sobj.nextInt();

       System.out.println("Enter the credit score:");
       CreditScore = sobj.nextInt();

       System.out.println("Is there Existing unpaid loan");
       ExistUnpaidLoan = sobj.next();


          if((ExistUnpaidLoan.equalsIgnoreCase("yes")) &&
               (ExistUnpaidLoan.equalsIgnoreCase("No")) == false
               )
          
          {
               System.out.println("Yes/No must be Valid");
          }

       if(Age < 0 || Income < 0 || CreditScore< 0)
       {
          System.out.println("Age/Income/CreditScore must be non-negative");
          return;
       }


        if(Age<21 && Age<60)
        {
          System.out.println("Loan Rejected");
          System.out.println("Age 21 to 60 inclusive");
          return;
        }
        else if(Income<25000)
        {
          System.out.println("Loan Rejected");
          System.out.println("Monthly income >= 25000");
          return;
        }
        else if(CreditScore<700)
        {
          System.out.println("Loan Rejected");
          System.out.println("Credit Score>700");
          return;
        }
        else if(ExistUnpaidLoan.equalsIgnoreCase("yes")==true)
        {
          System.out.println("Loan Rejected");
          System.out.println("Must NOT have an existing unpaid loan");
          return;
        }
        else
        {
          System.out.println("Loan Approved");
        }

     
     


     }
}