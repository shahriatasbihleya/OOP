public class PyramidRightDown5to1 
{
    public static void main(String[] args) 
    {
        for (int r = 5; r >= 1; r--) 
        {
            for (int c = 5; c >= 6 - r; c--) 
            {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}


