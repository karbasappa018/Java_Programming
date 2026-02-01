//  Write a program to display the grade of a student based on marks

class Logic
{
    void displayGrade(int marks)
    {
        if(marks>80 && marks<= 100)
        {
            System.out.println("Student have A grade\n");
        }
        else if(marks>60 && marks<=80)
        {
            System.out.println("Student have B grade\n");
        }
        else if(marks>40 && marks<= 60)
        {
            System.out.println("Student have C grade\n");
        }
        

    }

}
class Program19_2
{
    public static void main(String a[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);

    }
}