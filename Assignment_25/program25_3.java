//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program25_3
//  Function Name  : ArrayX, Accept, DisplayEvenDivisibleByFive
//  Description    : This program accepts N integers from the user and displays all elements which are even as well as divisible by 5.
//  Input          : Integer Array
//  Output         : Elements that are even and divisible by 5
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

    public void DisplayEvenDivisibleByFive()
    {
        int iCnt = 0;

        System.out.println("Elements which are even and divisible by 5:");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0 && Arr[iCnt] % 5 == 0)
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

public class program25_3
{
    public static void main(String args[])
    {
        int iSize = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();

        aobj.DisplayEvenDivisibleByFive();
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
//  10
//  25
//  40
//  17
//  50
//  21
//  60
//
//  Output:
//  Elements which are even and divisible by 5:
//  10
//  40
//  50
//  60
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////