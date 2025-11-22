import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("#\t");
            System.out.print(iCnt+"\t");
            System.out.print("*\t");

        }

    }
}

public class program26_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0;

        System.out.println("Enter the Number :");
        iValue1 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1);

    }
}