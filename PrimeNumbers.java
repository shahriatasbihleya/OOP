import java.util.Scanner; 
public class PrimeNumbers  
{ 
    public static void main(String[] args)  
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number (n): "); 
        int n = input.nextInt(); 
        System.out.println("Prime numbers between 1 and " + n + " are:"); 
        int i = 2;  
        while (i <= n)  
        { 
            boolean isPrime = true; 
            int j = 2; 
            while (j <= i / 2)  
            { 
                if (i % j == 0)  
                { 
                    isPrime = false; 
                    break; 
                } 
                j++; 
            } 
            if (isPrime)  
            { 
                System.out.print(i + " "); 
            } 
            i++; 
        } 
    }    
}


