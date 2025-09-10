public class Xor 
{
    public static void main(String[] args) 
    {
        
        int a = 12, b = 20;

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap : a=" + a + ", b=" + b);
    }
}
