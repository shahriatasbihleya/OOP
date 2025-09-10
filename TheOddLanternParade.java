public class TheOddLanternParade 
{
    public static void main(String[] args) 
    {
      
        int n = 6;

        int sum = 0, count = 0, current = 1;
        while (count < n) 
        {
            System.out.print(current + (count < n - 1 ? " " : ""));
            sum += current;
            current += 2;
            count++;
        }
        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
