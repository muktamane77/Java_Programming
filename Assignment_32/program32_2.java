import java.util.Scanner;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        if(iRow != iCol)
        {
            System.out.println("Invalid Input");
            System.out.println("Rows and columns must be same");
            return;
        }

        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i + j == iRow + 1)
                {
                    System.out.print("#\t");
                }
                else if(i + j < iRow + 1)
                {
                    System.out.print("*\t");
                }
                else                         
                {
                    System.out.print("@\t");
                }
            }
            System.out.println();
        }
    }
}

class program32_2
{
    public static void main(String A[])
    {
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter number of rows : ");
        int iValue1 = Sobj.nextInt();

        System.out.println("Enter number of columns : ");
        int iValue2 = Sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);
    }
}