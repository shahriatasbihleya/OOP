public class OddEven110 
{
    public static void main(String[] args) 
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + (i % 2 == 0 ? " Even" : " Odd"));
        }
    }
}
