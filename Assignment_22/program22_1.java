//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program22_1
//  Function Name  : ArrayX, Accept, CountEven
//  Description    : This function returns the frequency of even numbers.
//  Input          : Integer Array
//  Author         : Mukta Dhanraj Mane
//  Date           : 18/11/2025
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

class ArrayX
{
    public int Arr[];

    public ArrayX(int iNo)
    {
        Arr = new int[iNo];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int iCnt = 0;
        System.out.println("Enter the elements : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public int CountEven()
    {
        int iCnt = 0, iValue = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iValue++;
            }
        }
        return iValue;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program22_1
{
    public static void main(String args[])
    {
        int iValue = 0, iEven = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);

        aobj.Accept();
        iEven = aobj.CountEven();

        System.out.println("Count of even numbers is : " + iEven);
    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Enter the number of elements :
//  6
//  Enter the elements :
//  85
//  66
//  3
//  80
//  93
//  88
//  Count of even numbers is : 3
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////