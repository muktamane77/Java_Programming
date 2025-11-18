//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program23_1
//  Function Name  : ArrayX, Accept, CheckNumber
//  Description    : This function checks whether the given number is present in the array or not.
//  Input          : Integer Array, Integer
//  Output         : Boolean
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

    public boolean CheckNumber(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                return true;
            }
        }

        return false;
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program23_1
{
    public static void main(String args[])
    {
        int iValue = 0, iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);

        aobj.Accept();

        System.out.println("Enter number you want to search : ");
        iNo = sobj.nextInt();

        bRet = aobj.CheckNumber(iNo);

        if(bRet == true)
        {
            System.out.println(iNo + " is present in the array.");
        }
        else
        {
            System.out.println(iNo + " is NOT present in the array.");
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
//  11 is present in the array.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////