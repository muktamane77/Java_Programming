import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, iNo = 0;
        for(i = 1, iNo = 1; i <= iRow ; i++, iNo++)
        {
            for(j = iNo; j <= iCol ; j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}

public class program29_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the Number of rows:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Number of columns:");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1,iValue2);

    }
}