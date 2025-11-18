//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program25_1
//  Function Name  : ArrayX, Accept, DifferenceEvenOdd
//  Description    : This program calculates the difference between summation of even elements and summation of odd elements from a given array.
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

    public int DifferenceEvenOdd()
    {
        int iCnt = 0;
        int iEvenSum = 0;
        int iOddSum = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iEvenSum += Arr[iCnt];
            }
            else
            {
                iOddSum += Arr[iCnt];
            }
        }

        return iEvenSum - iOddSum;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program25_1
{
    public static void main(String args[])
    {
        int iSize = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();

        iRet = aobj.DifferenceEvenOdd();

        System.out.println("Difference between sum of even and odd elements is : " + iRet);
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
//  12
//  7
//  4
//  9
//  10
//  3
//
//  Output:
//  Difference between sum of even and odd elements is : -1
//
//  Explanation:
//  Even Sum = 12 + 4 + 10 = 26
//  Odd  Sum = 7 + 9 + 3  = 19
//  Difference = 26 - 19 = 7
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////