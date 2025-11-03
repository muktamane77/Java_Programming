//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : Logic
//  Function Name : sumEvenOddDigits
//  Description :   It is used to calculate the sum of even and odd digits of a given number
//  Input :         Integer
//  Author :        Mukta Dhanraj Mane
//  Date :          31/10/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            if(iDigit % 2 == 0)
            {
                iEvenSum = iEvenSum + iDigit;
            }
            else
            {
                iOddSum = iOddSum + iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Sum of even digits: " + iEvenSum);
        System.out.println("Sum of odd digits: " + iOddSum);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class program18_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 123456
//  Output : Sum of even digits: 12
//           Sum of odd digits: 9
//
//  Input : 98765
//  Output : Sum of even digits: 6
//           Sum of odd digits: 27
//
//  Input : 24680
//  Output : Sum of even digits: 20
//           Sum of odd digits: 0
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////