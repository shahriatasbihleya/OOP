public class AToZBreakk 
{
    public static void main(String[] args) 
    {
        char stop = 'k';
        char ch = 'a';
        while (ch <= 'z') 
        {
            if (ch == stop) break;
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();
    }
}




