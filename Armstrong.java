public class Armstrong 
{
    public static boolean isArmstrong3Digit(int n) 
    {
        int original = n, sum = 0;
        while (n > 0) 
        {
            int d = n % 10;
            sum += d * d * d; 
            n /= 10;
        }
        return sum == original;
    }
    public static void main(String[] args) 
    {
        int n = 371; 
        System.out.println(isArmstrong3Digit(n) ? "Armstrong" : "Not Armstrong");
    }
}

