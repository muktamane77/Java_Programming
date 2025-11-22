import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = iNo; iCnt > 0; iCnt--)
        {
            System.out.print(iCnt+"\t");
            System.out.print("#\t");
        }

    }
}

public class program26_2
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