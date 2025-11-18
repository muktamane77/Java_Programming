//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program24_4
//  Function Name  : ArrayX, Accept, DisplayThreeDigit
//  Description    : This function displays all elements from the array that contain exactly 3 digits.
//  Input          : Integer Array
//  Output         : Display
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

    public void DisplayThreeDigit()
    {
        int iCnt = 0;

        System.out.println("Numbers containing exactly 3 digits are : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 100 && Arr[iCnt] <= 999) ||
               (Arr[iCnt] <= -100 && Arr[iCnt] >= -999))
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

public class program24_4
{
    public static void main(String args[])
    {
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();

        aobj.DisplayThreeDigit();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input:
//  Enter number of elements :
//  7
//  Enter the elements :
//  15
//  123
//  7
//  1050
//  -250
//  99
//  875
//
//  Output:
//  Numbers containing exactly 3 digits are :
//  123
//  -250
//  875
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////