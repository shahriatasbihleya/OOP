import java.util.Scanner; 
public class SwapFirstLastDigit 
{ 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = input.nextInt(); 
        if (num < 10)  
        { 
            System.out.println("Number after swapping: " + num); 
            return; 
        } 
        int last = num % 10; 
        int first = num; 
        int multiplier = 1; 
        while (first >= 10)  
        { 
            first = first / 10; 
            multiplier *= 10; 
        } 
        int middle = (num % multiplier) / 10;  
        int swappedNum = last * multiplier + middle * 10 + first; 
        System.out.println("Number after swapping: " + swappedNum); 
    }     
}
