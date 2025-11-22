import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0, iNo = 0;

        for(i = 1; i <= iRow; i++)
        {
            if(i%2 == 0)
            {
              iNo = 1; 
            }
            else
            {
                iNo = 2;
            }
            for(j=1 ;j<=iCol; j++, iNo=iNo+2)
                {
                    System.out.print(iNo+"\t");
                }
            System.out.println();
        }
    }
}

public class program29_2
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