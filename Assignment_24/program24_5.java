//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program24_5
//  Function Name  : ArrayX, Accept, SumDigits, DisplayDigitSum
//  Description    : This program displays the summation of digits of each element present in the array.
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

    public int SumDigits(int iNo)
    {
        int iSum = 0, iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        return iSum;
    }

    public void DisplayDigitSum()
    {
        int iCnt = 0;

        System.out.println("Summation of digits for each number:");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt] + " is " + SumDigits(Arr[iCnt]));
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program24_5
{
    public static void main(String args[])
    {
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();

        aobj.DisplayDigitSum();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input:
//  Enter number of elements :
//  5
//  Enter the elements :
//  123
//  45
//  900
//  -88
//  7
//
//  Output:
//  Summation of digits for each number:
//  123 is 6
//  45 is 9
//  900 is 9
//  -88 is 16
//  7 is 7
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////