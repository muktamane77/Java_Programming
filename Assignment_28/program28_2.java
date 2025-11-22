import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j =0;
        char ch = '\0', ch1 = '\0';

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1, ch ='A', ch1 = 'a'; j <= iCol; j++, ch1++ ,ch++)
            {
                if((i%2)== 0)
                {
                    System.out.print(ch1+"\t");
                }
                else
                {
                    System.out.print(ch+"\t");
                }
            }
            System.out.println();
        }

    }
}

public class program28_2
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