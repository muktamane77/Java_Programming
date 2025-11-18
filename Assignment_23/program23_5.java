//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program23_5
//  Function Name  : ArrayX, Accept, ProductOdd
//  Description    : This function returns the product of all odd elements from the array.
//  Input          : Integer Array
//  Output         : Integer
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

    public int ProductOdd()
    {
        int iCnt = 0;
        int iProd = 1;
        boolean bOddFound = false;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                iProd = iProd * Arr[iCnt];
                bOddFound = true;
            }
        }

        if(bOddFound == false)
        {
            return 0;
        }

        return iProd;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program23_5
{
    public static void main(String args[])
    {
        int iValue = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);
        aobj.Accept();

        iRet = aobj.ProductOdd();

        System.out.println("Product of odd elements is : " + iRet);
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input:
//  Enter number of elements :
//  6
//  Enter the elements :
//  15
//  12
//  7
//  10
//  5
//  20
//
//  Output:
//  Product of odd elements is : 525
//  (15 * 7 * 5 = 525)
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////