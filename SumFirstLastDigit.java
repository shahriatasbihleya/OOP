import java.util.Scanner; 
public class SumFirstLastDigit  
{ 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = input.nextInt(); 
        int temp = Math.abs(num);  
        int lastDigit = temp % 10; 
 
        while (temp >= 10)  
        { 
            temp = temp / 10; 
        } 
        int firstDigit = temp; 
        int sum = firstDigit + lastDigit; 
        System.out.println("Sum of first and last digit of " + num + " is: " + sum); 
    }   
}