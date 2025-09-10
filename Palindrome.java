public class Palindrome 
{
    public static void main(String[] args) 
    {
        String s = "level"; 
        String rev = new StringBuilder(s).reverse().toString();
        if (s.equals(rev)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
