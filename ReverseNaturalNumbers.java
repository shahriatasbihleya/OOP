
import java.util.Scanner; 
public class ReverseNaturalNumbers  
{  
    public static void main(String[] args)  
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number (n): "); 
        int n = input.nextInt(); 
        int i = n;  
        System.out.println("Natural numbers from " + n + " to 1: "); 
        while (i >= 1)  
        { 
            System.out.print(i + " "); 
            i--;  
        } 
    }     
}

