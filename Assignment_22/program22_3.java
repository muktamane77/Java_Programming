//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program22_3
//  Function Name  : ArrayX, Accept, Check11
//  Description    : This function checks whether number 11 is present in the array or not.
//  Input          : Integer Array
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

    public boolean Check11()
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                return true;   // 11 found
            }
        }
        return false;          // 11 not found
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function for the Application
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class program22_3
{
    public static void main(String args[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iValue = sobj.nextInt();

        ArrayX aobj = new ArrayX(iValue);

        aobj.Accept();
        bRet = aobj.Check11();

        if(bRet == true)
        {
            System.out.println("11 is present in the array.");
        }
        else
        {
            System.out.println("11 is NOT present in the array.");
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
//  85
//  11
//  3
//  80
//  93
//  88
//  Output:
//  11 is present in the array.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////