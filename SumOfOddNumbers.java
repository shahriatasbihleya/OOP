import java.util.Scanner; 
public class SumOfOddNumbers  
{ 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number (n): "); 
        int n = input.nextInt(); 
        int i = 1;   
        int sum = 0;  
 
        while (i <= n)  
        { 
            sum += i; 
            i += 2;    
        } 
        System.out.println("Sum of all odd numbers between 1 to " + n + " is: " + sum); 
    }  
}

