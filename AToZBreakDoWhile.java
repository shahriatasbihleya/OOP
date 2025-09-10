public class AToZBreakDoWhile 
{
    public static void main(String[] args) 
    {
        char stop = 'k'; 
        char ch = 'a';
        do {
            if (ch == stop) break;
            System.out.print(ch + " ");
            ch++;
        } while (ch <= 'z');
        System.out.println();
    }
}

