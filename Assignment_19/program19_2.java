//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : Logic
//  Function Name : displayGrade
//  Description :   It is used to display the grade of a student based on the entered marks.
//  Input :         Integer
//  Author :        Mukta Dhanraj Mane
//  Date :          31/10/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayGrade(int iMarks)
    {
        if(iMarks < 0 || iMarks > 100)
        {
            System.out.println("Invalid Marks! Please enter between 0 and 100.");
        }
        else if(iMarks >= 90)
        {
            System.out.println("Grade: A+");
        }
        else if(iMarks >= 75)
        {
            System.out.println("Grade: A");
        }
        else if(iMarks >= 60)
        {
            System.out.println("Grade: B");
        }
        else if(iMarks >= 50)
        {
            System.out.println("Grade: C");
        }
        else if(iMarks >= 35)
        {
            System.out.println("Grade: D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class program19_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 95   Output : Grade: A+
//  Input : 82   Output : Grade: A
//  Input : 67   Output : Grade: B
//  Input : 52   Output : Grade: C
//  Input : 38   Output : Grade: D
//  Input : 25   Output : Fail
//  Input : 120  Output : Invalid Marks! Please enter between 0 and 100.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////