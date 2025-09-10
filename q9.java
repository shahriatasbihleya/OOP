public class q9 
{
    public static void main(String[] args) 
    {
        int i = 1;
        do 
        {
            System.out.print(i + (i < 10 ? " " : ""));
            i++;
        } while (i <= 10);
        System.out.println();
    }
}
