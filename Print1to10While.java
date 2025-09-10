public class Print1to10While 
{
    public static void main(String[] args) 
    {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + (i < 10 ? " " : ""));
            i++;
        }
        System.out.println();
    }
}
