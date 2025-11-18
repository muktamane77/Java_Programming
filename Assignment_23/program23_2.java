//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program23_2
//  Function Name  : ArrayX, Accept, FirstOcc
//  Description    : This function returns the index of the first occurrence of the given number from the array.
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

    public int FirstOcc(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                return iCnt;
            }
        }

        return -1;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program23_2
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

        iRet = aobj.FirstOcc(iNo);

        if(iRet == -1)
        {
            System.out.println("Number not found in the array.");
        }
        else
        {
            System.out.println("First occurrence of " + iNo + " is at index : " + iRet);
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
//  55
//  11
//  80
//  93
//  21
//
//  Enter number you want to search :
//  11
//
//  Output:
//  First occurrence of 11 is at index : 2
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////