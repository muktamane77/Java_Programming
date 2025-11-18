//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program23_3
//  Function Name  : ArrayX, Accept, LastOcc
//  Description    : This function returns the index of the last occurrence of the given number from the array.
//  Input          : Integer Array, Integer
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

    public int LastOcc(int iNo)
    {
        int iCnt = 0;
        int iPos = -1;
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iPos = iCnt;
            }
        }

        return iPos;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program23_3
{
    public static void main(String args[])
    {
        int iValue = 0, iNo = 0, iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);

        aobj.Accept();

        System.out.println("Enter number you want to search : ");
        iNo = sobj.nextInt();

        iRet = aobj.LastOcc(iNo);

        if(iRet == -1)
        {
            System.out.println("Number not found in the array.");
        }
        else
        {
            System.out.println("Last occurrence of " + iNo + " is at index : " + iRet);
        }
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
//  21
//  11
//  55
//  11
//  90
//  21
//
//  Enter number you want to search :
//  11
//
//  Output:
//  Last occurrence of 11 is at index : 3
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////