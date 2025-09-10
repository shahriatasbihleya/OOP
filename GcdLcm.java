public class GcdLcm
{
    public static int gcdByChecking(int a, int b) 
    {
        if (a == 0 && b == 0) return 0;
        int limit = Math.min(Math.abs(a), Math.abs(b));
        int g = 1;
        for (int i = 1; i <= limit; i++) 
        {
            if (a % i == 0 && b % i == 0) g = i;
        }
        return g;
    }
    public static void main(String[] args) 
    {
        int a = 18, b = 24; 
        int g = gcdByChecking(a, b);
        long l = (g == 0) ? 0 : (long) Math.abs((long) a * (long) b) / g;
        System.out.println("GCD = " + g);
        System.out.println("LCM = " + l);
    }
}
