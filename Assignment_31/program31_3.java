import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Row number and column number should be same");
            return;
        }
        for(i = 1; i<= iRow; i++)
        {
            for(j = 1; j<= iCol; j++)
            {
                if(i == j)
                {
                    System.out.print("$\t");
                }
                else if(i > j)
                {
                    System.out.print("#\t");
                }
                else
                {
                    System.out.print("*\t");
                }
                
            }
            System.out.println();
        }

    }
}
class program31_3
{
    public static void main(String A[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter Number of rows : ");
        iValue1 = Sobj.nextInt();

        System.out.println("Enter Number of columns : ");
        iValue2 = Sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}