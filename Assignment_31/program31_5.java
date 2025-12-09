import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {

        int i = 0, j = 0, s = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Row number and column number should be same");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            for(s = 1; s < i; s++)
            {
                System.out.print("\t");
            }

            for(j = i; j <= iRow; j++)
            {
                System.out.print(j + "\t");
            }

            System.out.println();
        }
    }
}

class program31_5
{
    public static void main(String A[])
    {
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter Number of Rows : ");
        int iValue1 = Sobj.nextInt();

        System.out.println("Enter Number of Columns : ");
        int iValue2 = Sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}
