import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i, j;

        if(iRow != iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Rows and Columns must be same");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i == 1 || i == iRow ||      // top & bottom rows
                   j == 1 || j == iCol ||      // left & right columns
                   i == j)                      // diagonal
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

class program31_4
{
    public static void main(String A[])
    {
        Scanner Sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter number of rows : ");
        iValue1 = Sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iValue2 = Sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}