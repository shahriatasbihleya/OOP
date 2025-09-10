public class SmallestNumber {
    public static void main(String[] args) {
        
        int a = 11, b = 5, c = 9;

        int min = Math.min(a, Math.min(b, c));
        System.out.println("Smallest = " + min);
    }
}
