//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program23_4
//  Function Name  : ArrayX, Accept, DisplayRange
//  Description    : This function displays all elements from the array that lie within the given range.
//  Input          : Integer Array
//  Output         : Display elements
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

    public void DisplayRange(int iStart, int iEnd)
    {
        int iCnt = 0;

        System.out.println("Elements in the range " + iStart + " to " + iEnd + " are:");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= iStart && Arr[iCnt] <= iEnd)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program23_4
{
    public static void main(String args[])
    {
        int iValue = 0, iStart = 0, iEnd = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);

        aobj.Accept();

        System.out.println("Enter starting point of range : ");
        iStart = sobj.nextInt();

        System.out.println("Enter ending point of range : ");
        iEnd = sobj.nextInt();

        aobj.DisplayRange(iStart, iEnd);
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
//  10
//  25
//  30
//  45
//  50
//  70
//
//  Enter starting point of range :
//  20
//
//  Enter ending point of range :
//  50
//
//  Output:
//  Elements in the range 20 to 50 are:
//  25
//  30
//  45
//  50
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////