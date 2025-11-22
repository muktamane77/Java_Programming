import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + 2;
            System.out.print(iSum+"\t");

        }

    }
}

public class program26_5
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