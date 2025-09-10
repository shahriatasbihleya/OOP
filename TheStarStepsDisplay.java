public class TheStarStepsDisplay 
{
    public static void main(String[] args) 
    {
       
        int rows = 8;

        int r = 1;
        while (r <= rows) 
        {
            int c = 1;
            while (c <= r) 
            {
                System.out.print("*");
                c++;
            }
            System.out.println();
            r++;
        }
    }
}
