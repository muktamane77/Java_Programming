//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name : Logic
//  Function Name : productOfDigits
//  Description :   This function calculates the product of all digits in the given number.
//  Input :         Integer
//  Author :        Mukta Dhanraj Mane
//  Date :          31/10/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void productOfDigits(int iNo)
    {
        int iDigit = 0;
        int iProduct = 1;

        if(iNo == 0)
        {
            iProduct = 0;
        }
        else
        {
            while(iNo != 0)
            {
                iDigit = iNo % 10;
                iProduct = iProduct * iDigit;
                iNo = iNo / 10;
            }
        }

        System.out.println("Product of digits is: " + iProduct);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

class program21_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input : 234      Output : Product of digits is: 24
//  Input : 105      Output : Product of digits is: 0
//  Input : 7        Output : Product of digits is: 7
//  Input : 0        Output : Product of digits is: 0
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////