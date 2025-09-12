import java.util.Scanner; 
public class SumOfEvenNumbers 
{ 
    public static void main(String[] args)  
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number (n): "); 
        int n = input.nextInt(); 
        int i = 2;    
        int sum = 0;  
        while (i <= n) 
        { 
            sum += i;   
            i += 2;     
        } 
        System.out.println("Sum of all even numbers between 1 to " + n + " is: " + sum); 
    }    
}

