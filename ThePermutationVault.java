public class ThePermutationVault 
{
    public static void main(String[] args) 
    {
       
        int n = 9;

        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        System.out.println(n + "! = " + fact);
    }
}

