//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : Logic
//  Function Name : countEvenOddRange
//  Description :   This function counts how many even and odd numbers exist between 1 and the given number.
//  Input :         Integer
//  Author :        Mukta Dhanraj Mane
//  Date :          31/10/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void countEvenOddRange(int iNo)
    {
        int iCnt = 0;
        int evenCount = 0;
        int oddCount = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
        }

        System.out.println("Count of even numbers between 1 and " + iNo + " is: " + evenCount);
        System.out.println("Count of odd numbers between 1 and " + iNo + " is: " + oddCount);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class program21_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 10   Output : Even = 5, Odd = 5
//  Input : 15   Output : Even = 7, Odd = 8
//  Input : 50   Output : Even = 25, Odd = 25
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////