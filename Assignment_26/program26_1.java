import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch ='\0';
        ch = 'A';
        for(iCnt = 1; iCnt <= iNo; iCnt++, ch++)
        {
            System.out.printf("%c\t",ch);
        }

    }
}

public class program26_1
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