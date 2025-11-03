//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : Logic
//  Function Name : checkPrime
//  Description :   It is used to check whether a given number is prime or not
//  Input :         Integer
//  Author :        Mukta Dhanraj Mane
//  Date :          31/10/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPrime(int iNo)
    {
        int iCnt = 0;
        boolean isPrime = true;

        if(iNo <= 1)
        {
            isPrime = false;
        }
        else
        {
            for(iCnt = 2; iCnt <= iNo / 2; iCnt++)
            {
                if(iNo % iCnt == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
        {
            System.out.println(iNo + " is a Prime number.");
        }
        else
        {
            System.out.println(iNo + " is NOT a Prime number.");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point function for the application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class program18_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 11      Output : 11 is a Prime number.
//  Input : 25      Output : 25 is NOT a Prime number.
//  Input : 1       Output : 1 is NOT a Prime number.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////