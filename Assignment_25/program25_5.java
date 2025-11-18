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

        System.out.println("Enter the elements : ");
        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void DisplayMultipleOf11()
    {
        System.out.println("Elements which are multiples of 11:");

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] % 11 == 0)
            {
                System.out.println(Arr[i]);
            }
        }
    }
}

public class program25_5
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);
        
        aobj.Accept();
        aobj.DisplayMultipleOf11();
    }
}