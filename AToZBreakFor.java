public class AToZBreakFor 
{
    public static void main(String[] args) 
    {
        char stop = 'o'; 
        for (char ch = 'a'; ch <= 'z'; ch++) 
        {
            if (ch == stop) break;
        
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
