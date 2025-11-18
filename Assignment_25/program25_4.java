//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name     : ArrayX, program25_4
//  Function Name  : ArrayX, Accept, DisplayDivisibleBy3And5
//  Description    : This program accepts N integers from the user and displays all elements
//                   which are divisible by both 3 and 5.
//  Input          : Integer Array
//  Output         : Elements divisible by 3 and 5
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

    public void DisplayDivisibleBy3And5()
    {
        int iCnt = 0;

        System.out.println("Elements divisible by 3 and 5:");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 3 == 0 && Arr[iCnt] % 5 == 0)
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

public class program25_4
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        aobj.Accept();
        aobj.DisplayDivisibleBy3And5();
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
//  10
//  30
//  22
//  45
//  60
//
//  Output:
//  Elements divisible by 3 and 5:
//  15
//  30
//  45
//  60
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////